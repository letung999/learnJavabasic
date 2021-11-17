package java_OOP.exampleInterface;

import java.io.Serializable;

public interface Animal{
    /**
     * Nhắc lại về Abstract class;
     * nêu ra nhưng chưa được định nghĩa và việc đó tùy thuộc vào lớp con định nghĩa
     *
     */
    void move();//chỉ nêu ra hoặc mô tả những hành động chung nhất
    void sleep();
    void eat();
}
