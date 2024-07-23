public class Main {
    public static void main(String[] args){
        String[] inventory = new String[5];
        String[] z = new String[4];
        //Array values
        inventory[0] = "HP Potion";
        inventory[1] = "Magic Sword";
        inventory[2] = "Wooden Shield";
        inventory[3] = "Key";


        //Print array values
        for(int i = 0; i < inventory.length; i++){
            System.out.println(inventory[i]);
        }
        //Check for array values
        for(int i = 0; i < inventory.length; i++){
            String item = inventory[i];
            if(item != null && item.equals("Key")){
                System.out.println("You have a key in your inventory!");
                break;
            }
        }
        for(int i = 0; i < inventory.length; i++){
            String item = inventory[i];
            //String[] z = new String[0];
            if(item != null){
               z[i] = item;

            }
        }
        System.out.println("There are " + z.length + " spots remaining!");
    }
}
