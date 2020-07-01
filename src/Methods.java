import java.io.*;

class Methods implements Serializable {
     static void serialize(Object emp) throws IOException {
         FileOutputStream fileOut = new FileOutputStream("Employee.txt");
         ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOut);
         objectOutputStream.writeObject(emp);
         objectOutputStream.flush();
         objectOutputStream.close();
         fileOut.close();
         System.out.println("Серіалізацію успішно виконано.");
         String str = emp.toString().replace(']', ' ')
                 .replace('[', ' ').replaceAll(",", "");
         System.out.println(str);
    }

    static void deserialize(Object emp) throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream("Employee.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileIn);
        emp =  objectInputStream.readObject();
        objectInputStream.close();
        fileIn.close();
        System.out.println("Десеріалізацію успішно виконано.");
        String str = emp.toString().replace(']', ' ')
                .replace('[', ' ').replaceAll(",", "");
        System.out.println(str );
    }
}