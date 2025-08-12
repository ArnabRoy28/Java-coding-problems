public class Main {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            return (cigars >= 40);
        } else {
            return (cigars >= 40 && cigars <= 60);
        }
    }

    public static void main(String[] args) {
        Main party = new Main();
        
      
        System.out.println("cigarParty(30, false) -> " + party.cigarParty(30, false));
        System.out.println("cigarParty(50, false) -> " + party.cigarParty(50, false));
        System.out.println("cigarParty(70, true) -> " + party.cigarParty(70, true));
    }
}
