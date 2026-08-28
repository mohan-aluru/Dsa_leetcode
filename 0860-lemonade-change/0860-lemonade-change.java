class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fives=0;
        int tens=0;
        int twenty=0;
        for(int  i:bills){
            if(i==5){
                fives++;
            }else if(i==10){
                if(fives<1)return false;
                tens++;
                fives--;
            }else if(i==20){
                if(fives>=1 && tens>=1)
               { twenty++;
                tens--;
                fives--;
            }else if(fives>=3){fives=fives-3;twenty++;}else{return false;}
            }
        } 
        return true;
    }
}