public class Loop {
    public static void main(String[] args){

    }

    public void acend(int list[],int start,int end){
        for(int i =start ; i < end ; i++){
            System.out.println(list[i]);
        }
    }

    public void decend(int list[],int start){
        for(int i =start-1 ; i > -1; i--){
            System.out.println(list[i]);
        }
    }
}
