package java_OOP.practiceOOP.model.OOP1.controller;

import java_OOP.practiceOOP.model.OOP1.model.BRM;
import java_OOP.practiceOOP.model.OOP1.model.Book;

import java.util.ArrayList;

public class ControllerUtilities {
    public ArrayList<BRM> updateFile(ArrayList<BRM> brms, BRM brm){
        boolean isUpdate = false;
        for(int i = 0; i<brms.size(); ++i){
            if(brm.getBook().getBookId() == brms.get(i).getBook().getBookId()
                    && brm.getReader().getReaderId() == brms.get(i).getReader().getReaderId()){
                isUpdate = true;
                brms.set(i, brm);
            }
        }
        if(isUpdate == false){
            brms.add(brm);
        }
        return brms;
    }
    public ArrayList<BRM> updateTotalOfBorrow(ArrayList<BRM> brms){
        BRM brm;
        for(int i = 0; i< brms.size(); ++i){
            brm = brms.get(i);
            int count = 0;//cu lap mai nhung count kkhong the thay doi
            for(int j = 0; j< brms.size(); ++j){
                if(brm.getReader().getReaderId() == brms.get(j).getReader().getReaderId()){
                    count += brms.get(j).getNumOfBorrow();
                }
            }
            brm.setTotal(count);
            brms.set(i, brm);
        }
        return  brms;
    }
    public void sortByName(ArrayList<BRM> brms){
        for(int i = 0; i<brms.size(); ++i){
            for(int j = brms.size()-1; j>i; j--){
                BRM bj = brms.get(j);
                BRM bbj = brms.get(j-1);
                if(bbj.getReader().getFullName().substring(bbj.getReader().getFullName().lastIndexOf(" "))
                        .compareTo(bj.getReader().getFullName().substring(bj.getReader().getFullName().lastIndexOf(" ")))>0){
                    brms.set(j, bbj);
                    brms.set(j-1, bj);
                }
            }
        }
    }
    public void sortByTotal(ArrayList<BRM> brms){
        for(int i =0; i<brms.size(); ++i){
            for(int j = brms.size()-1; j >i; j--){
                BRM bj = brms.get(j);
                BRM bbj = brms.get(j-1);
                if(bj.getTotal()<bbj.getTotal()){
                    brms.set(j, bbj);
                    brms.set(j-1, bj);
                }
            }
        }
    }

    public ArrayList<BRM> searchByName(ArrayList<BRM> brms, String key){
        ArrayList<BRM> list = new ArrayList<>();
        String regex = ".*" + key.toLowerCase() + ".*";
        for(int i = 0; i<brms.size(); ++i){
            BRM brm = brms.get(i);
            if(brm.getReader().getFullName().toLowerCase().matches(regex)){
                list.add(brm);
            }
        }
        return list;
    }

    public void searchNameBook(ArrayList<Book> books, String key){
        boolean ok = false;
        String regex = ".*" + key.toLowerCase() + ".*";
        for (int i = 0; i <books.size() ; i++) {
            if(books.get(i).getBookName().toLowerCase().matches(regex)){
                ok = true;
                System.out.println(books.get(i));
            }
        }
        if(ok == false){
            System.out.println("no search information Book");
        }
    }
}
