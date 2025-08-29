abstract class Course {
    String title; int duration;
    abstract void startCourse();
    abstract void endCourse();
    void courseDetails() { ... }
}

interface CertificateProvider { 
    void generateCertificate();
     }

class VideoCourse extends Course implements CertificateProvider { 

    }
class LiveCourse extends Course { 
    
 }

class Test{
    public static void main(String args[]){
        
    }
}