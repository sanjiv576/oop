class Experiment{
//    String name;
//    Experiment(){
//        name = "Sanjiv";
//    }
//
//    public static void main(String[] args) {
//
//        Experiment obj = new Experiment();
//        System.out.print("Name: " + obj.name);
//
//    }

    public static void main(String[] args) {
//        String districts[] = {"Ramechhap", "Kathmandu", "Sindhuli", "Chitwan", "Pokhara", "Jhapa"};
//        for (int i = 0; i < districts.length; i++){
//            System.out.println(districts[i]);
//        }


        String[] allFields = {"Sanjiv", "", "Shrestha", "2323", "", "shrestha@"};
        String[] fieldsName = {"newFirstName", "newMiddleName", "newLastName", "newContact", "newAddress", "newEmail"};


        String emptyFields = "";
        String filledFields = "";
        for (int i = 0; i < allFields.length; i++){
            if (allFields[i].isEmpty()){
                emptyFields += i;
                System.out.println(fieldsName[i] + " : ");
                continue;
            }
            filledFields += i;
            System.out.println(fieldsName[i] + " : " + allFields[i]);
        }

        System.out.println("empty fields index : " + emptyFields);
        System.out.println("Filled fields index : " + filledFields);
    }
}