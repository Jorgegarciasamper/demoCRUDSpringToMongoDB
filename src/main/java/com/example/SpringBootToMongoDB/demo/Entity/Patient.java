package com.example.SpringBootToMongoDB.demo.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//https://www.baeldung.com/spring-data-mongodb-gridfs
//https://howtodoinjava.com/mongodb/java-mongodb-getsave-image-using-gridfs-apis/
//Save an image into MongoDB
//private static void saveImageIntoMongoDB(DB db) throws IOException {
//    String dbFileName = "DemoImage";
//    File imageFile = new File("c:\\DemoImage.png");
//    GridFS gfsPhoto = new GridFS(db, "photo");
//    GridFSInputFile gfsFile = gfsPhoto.createFile(imageFile);
//    gfsFile.setFilename(dbFileName);
//    gfsFile.save();
//}
    /*
    private String pharmacos;
    private String recomendacionesFarmacos;
    private String fenotiposAsociados;
    private String publicaciones;
    private String genesAsociados;
    private String pathways;
    private String recomendacionesClinicas;
    */
//CONFIGURACION DE LA ENTIDAD
//@Document(collection = "Patients")
public class Patient {

    //@Id
    private Integer id;
    private String username;
    //private String lastName;
    //private String email;
    //private String password;
    //private String dbImageFile;

    public Patient(Integer id, String username){//, String lastName, String email, String password, String dbImageFile) {
        this.id = id;
        this.username = username;
//        this.lastName = lastName;
//        this.email = email;
//        this.password = password;
//        this.dbImageFile = dbImageFile;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    //public String getLastName() {
    //    return lastName;
    //}
//
    //public void setLastName(String lastName) {
    //    this.lastName = lastName;
    //}
//
    //public String getEmail() {
    //    return email;
    //}
//
    //public void setEmail(String email) {
    //    this.email = email;
    //}
//
    //public String getPassword() {
    //    return password;
    //}
//
    //public void setPassword(String password) {
    //    this.password = password;
    //}
//
    //public String getDbImageFile() {
    //    return dbImageFile;
    //}
//
    //public void setDbImageFile(String dbImageFile) {
    //    this.dbImageFile = dbImageFile;
    //}
}
