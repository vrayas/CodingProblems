import java.util.ArrayList;

public class VihaanBinarySearch1 {
    /*
    Question:
    Array = {-1,0,3,9,7,9}
    Target = 9
    Output = 4
     */
    public static void main(String[] args){
        int[] nums = {-1,0,3,9,9,8};
        int target = 9;
        System.out.println(findTargetApperance(nums, target));
        System.out.println(findTargetPosition(nums, target));
    }
    public static int findTargetApperance(int[] nums, int target){
        int TotalNines = 0;
        int currentNumber = 0;
        int CheckingNumber = 0;
        while(CheckingNumber != nums.length) {
            if (nums[currentNumber] == target) {
                TotalNines += 1;
            }
            CheckingNumber+=1;
            currentNumber+=1;
        }
        return TotalNines;
    }
    public static ArrayList<Integer> findTargetPosition(int[] nums, int target){
        int CurrentArrayNumber = 0;
        int CurrentArrayNumberChecker = 0;
        ArrayList<Integer> Positions = new ArrayList<Integer>();
        while(CurrentArrayNumber != nums.length){
            if(nums[CurrentArrayNumberChecker] == target){
                Positions.add(CurrentArrayNumberChecker);
            }
            CurrentArrayNumber += 1;
            CurrentArrayNumberChecker += 1;
        }
        return Positions;
    }
}
