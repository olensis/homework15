import org.w3c.dom.ls.LSOutput;

public class Human {
    String name;
    int dateOfBirth;
    String cityOfResidence;
    String post;
    Human ( int dateOfBirth) {
        name = "Информация не заполнена";
        cityOfResidence = "Информация не заполнена";
        post = "Информация не заполнена";

    }
    Human (String name,int dateOfBirth,String cityOfResidence, String post){
        this.name =name;
        this.dateOfBirth = dateOfBirth;
        this.cityOfResidence=cityOfResidence;
        this.post = post;

           if (dateOfBirth > 0) {
            this.dateOfBirth = dateOfBirth;
        }else {
            System.out.println( "Возраст не может быть отрицательным");

        }

    }

    void humans (){
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + cityOfResidence +  ". Я родился в " + dateOfBirth + ". Я работаю на должности " + post +  " году. Будем знакомы!" );
    }


}

