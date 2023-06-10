import java.sql.SQLOutput;
import java.util.concurrent.Callable;

//Создайте класс Book, который содержит в себе данные о названии, авторе и годе публикации книги.
// Типы полей должны быть String, Author (его мы создадим в п. 2) и int.
//Создайте класс Author, который содержит в себе данные об имени и фамилии автора.
//Напишите конструкторы для обоих классов, заполняющие все поля.
//Создайте геттеры для всех полей автора и всех полей книги.
//Создайте сеттер для поля «Год публикации» у книги.
//В методе main создайте несколько объектов «Книга» (достаточно двух) и несколько объектов «Автор»
// (достаточно тоже двух) и инициализируйте их. Учтите, что авторы являются обязательными и книги не могут
// создаваться без авторов.
//Метод main не должен находиться в классах Book и Author.
//
//Создайте отдельный класс для запуска приложения и объявите метод main в нем.
//
//В том же методе main измените год публикации одной из книг с помощью сеттера.
public class App {
    public static void main(String[] args) {
        Author sinsero = new Author("Джен", "Синсеро");
        Author marks = new Author("Карл", "Маркс");
        Book niSu = new Book("Ни сы", sinsero, 2013);
        Book capital = new Book("Капитал", marks, 1867);

        niSu.setYear(1867);
        System.out.println("Книга: " + niSu.getName() + " опубликована:" +
                niSu.getYear() + ". Автор книги: " + niSu.getAuthor().getFirstName() + " "
                + niSu.getAuthor().getLastName());

        System.out.println("Книга: " + capital.getName() + " опубликована:" +
                capital.getYear() + ". Автор книги: " + capital.getAuthor().getFirstName() + " "
                + capital.getAuthor().getLastName());


        System.out.println(niSu.toString());
        System.out.println(capital.toString());

        niSu.equals(niSu);
        capital.equals(capital);
        System.out.println(niSu.equals(niSu));
        System.out.println(capital.equals(capital));



    }
}


