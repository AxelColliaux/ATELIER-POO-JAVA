public class Arena {
    public static void main(String[] args){

        Monster zombie = new Monster("Zombie", 30, 100);
        Monster claqueur = new Monster("Claqueur", 10, 150);

        while (zombie.getLife() > 0 && claqueur.getLife() > 0){

            zombie.attack(claqueur);

            if (claqueur.getLife() > 0){
                System.out.println(claqueur.getName()+" has "+claqueur.getLife()+" points remaining");
            } else {
                System.out.println(claqueur.getName()+" is KO!");
            }

            if((claqueur.getLife() <= 0)){
                break;
            }

            if (zombie.getLife() > 0){
                System.out.println(zombie.getName()+" has "+zombie.getLife()+" points remaining");
            } else {
                System.out.println(zombie.getName()+" is KO!");
            }

            if((zombie.getLife() <= 0)){
                break;
            }
        }    
    }
}
