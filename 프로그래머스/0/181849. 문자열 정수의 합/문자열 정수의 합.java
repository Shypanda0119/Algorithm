class Solution {
    public int solution(String num_str) {
        String[] arr =num_str.split("");
		int[] num = new int[arr.length];
		int sum = 0;
		
		for(int i =0; i<arr.length; i++){
			num[i] = Integer.parseInt( arr[i] );
		}

		for( int a : num){
			sum += a;
		}
        return sum;
    }
}