class Solution {
    public int lastStoneWeight(int[] arr) {
       ArrayList<Integer> list = new ArrayList<>();
        for(int num : arr){
            list.add(num);
        }

       while(list.size() > 1){
        Collections.sort(list,Collections.reverseOrder());
        int x = list.get(0);
        int y = list.get(1);
        if(x == y){
            list.remove(0);
            list.remove(0);
        }
        else if( x > y){
            int n = x -y;
            list.remove(0);
            list.remove(0);
            list.add(n);
        }
       }
       return list.isEmpty() ? 0 : list.get(0);

        }
    }
