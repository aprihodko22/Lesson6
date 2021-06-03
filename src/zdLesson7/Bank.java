package zdLesson7;

public class Bank {
    private ClientHistoryCatalog clientHistoryCatalog;
    private int numberOfCredit;
    String str = "IamHuiSoba4i";
    

    public int getNumberOfCredit() {
        return numberOfCredit;
    }

    public void setNumberOfCredit(int numberOfCredit) {
        this.numberOfCredit = numberOfCredit;
    }

    public void vero9tn() {
        
        if (clientHistoryCatalog.vero9tnost() == true) {
            if(numberOfCredit > 0){
                
                System.out.println(clientHistoryCatalog.type.whoAmI() + " Mo9 vero9tnost' snishena na 25%, potomywto y min9 "
                        +numberOfCredit +" credit(a)" );
            } else {
                System.out.println(clientHistoryCatalog.type.whoAmI() + " Mo9 vero9tnost' ne snishena, potomywto y min9 "
                        + numberOfCredit+ " credit(a)");
            }
        } else if(numberOfCredit > 0) {
            System.out.println(clientHistoryCatalog.type.whoAmI() + " Mo9 vero9tnost' snish na 10%, potomywto y min9 "
                    + numberOfCredit +" credit(a)");
        } else {
            System.out.println(clientHistoryCatalog.type.whoAmI() + " Mo9 vero9tnost' ne snishena, potomywto y min9 "
                    + numberOfCredit +" credit(a)");
        }
    }


    public Bank(Client clientHistoryCatalog, int numberOfCredit) {
        this.clientHistoryCatalog = new ClientHistoryCatalog(clientHistoryCatalog);
        this.numberOfCredit = numberOfCredit;
    }

    public class ClientHistoryCatalog {
        private Client type;
        private boolean isWho;
        
        public Client getType() {
            return type;
        }

        public void setType(Client type) {
            this.type = type;
        }

        public boolean isWho() {
            return isWho;
        }

        public void setWho(boolean who) {
            isWho = who;
        }

        public ClientHistoryCatalog(Client type) {
            this.type = type;
        }

        public boolean vero9tnost() {
            if (type==  Client.Yr) {
                isWho = true;

            } else {
                isWho = false;
            }
            return isWho;
        }
    }
    public static class StringCaseTranslator {
        private Client client;
        public static String toScreamSnakeCase(String client) {
            String result = "";
            char c = client.charAt(0);
            result = result +Character.toLowerCase(c);
            for(int i = 1; i< client.length(); i++){
                char ch =client.charAt(i);
                if(Character.isUpperCase(ch)){
                    result = result + '_';
                    result = result + Character.toLowerCase(ch);
                }else {
                    result = result +ch;
                }
            }return result;
        }
    }
}


