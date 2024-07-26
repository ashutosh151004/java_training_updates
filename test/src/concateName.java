public class concateName {
    public static void main(String[] args) {
        Person person = new person();
        String tname = person.nameConcatenate(fname "Ashutosh",lname "Singh");
        System.out.println("Enter full name in Japan: " + tname); 
    }
}
class person{
String nameConcatenate(String fname,String lname){
    return lname + fname;
}
}