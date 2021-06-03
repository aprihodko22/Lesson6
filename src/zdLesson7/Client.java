package zdLesson7;

public enum Client {
    Yr("I am Yr Lico."),
    Fiz("I am Fiz Lico.");

    private String typeOfClient;

    public String getTypeOfClient() {
        return typeOfClient;
    }

    public void setTypeOfClient(String typeOfClient) {
        this.typeOfClient = typeOfClient;
    }

    Client(String typeOfClient){
        this.typeOfClient = typeOfClient;

    }
    public String whoAmI(){
     return typeOfClient;
    }

}
