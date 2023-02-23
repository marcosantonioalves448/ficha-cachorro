public class onomatopeias {    
     public static void main(String[] args) {
    
            int onomatopeia = (int)(Math.random() * 1000);
    
            if(onomatopeia >= 0 && onomatopeia < 10){
                System.out.println("Woof-woof");
            }else if (onomatopeia > 10 && onomatopeia <= 100) {
                System.out.println("au, au");
            }else if (onomatopeia <= 200 && onomatopeia > 100) {
                System.out.println("bau, bau");
            }else if (onomatopeia <= 300 && onomatopeia > 200) {
                System.out.println("vogh, vogh");
            }else if (onomatopeia <= 400 && onomatopeia > 300) {
                System.out.println("ruff, ruff");
            }else if (onomatopeia <= 500 && onomatopeia > 400) {
                System.out.println("ruff, ruff");
            }else if (onomatopeia <= 600 && onomatopeia > 500) {
                System.out.println("arf, arf");
            }else {
                System.out.println("yap, yap");
            }
    
        }
    } 
