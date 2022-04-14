package JavaSyntax.Level03.Lecture04;
/*Привет StarCraft!
Создать 5 зергов, 3 протосса и 4 террана.
Дать им всем уникальные имена.
 */
public class HelloStarcraft {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg[] zerg = new Zerg[5];
        Protoss[] protoss = new Protoss[3];
        Terran[] terran = new Terran [4];

        int i;
        for (i=0;i<zerg.length;i++) {
            zerg[i] = new Zerg();
            zerg[i].name = "zerg_"+i;
        }

        for (i=0;i<protoss.length;i++) {
            protoss[i] = new Protoss();
            protoss[i].name = "protoss_"+i;
        }

        for (i=0;i<terran.length;i++) {
            terran[i] = new Terran();
            terran[i].name = "terran_"+i;
        }
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}