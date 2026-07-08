class Solution {
    public int maxNumberOfBalloons(String text) {
        if( text.length() < 7 ) return 0;
        HashMap<Character,Integer> map = new HashMap<>();

        for(char s : text.toCharArray()){
            if( s == 'b' ||  s == 'a' ||  s == 'l' ||  s == 'o' ||  s == 'n' ){
                if( !map.containsKey(s) ){
                    map.put( s , 1 );
                }else {
                    map.put( s , map.get(s)+1 );
                }
            }
        }
            if( null == map.get('l') ) return 0;

            map.put( 'l' , map.get( 'l' )/2 );

            if(  null == map.get('o') ) return 0;

            map.put( 'o' , map.get( 'o' )/2);

            if( null == map.get('b') ||  null == map.get('a') ||  null == map.get('n') ) return 0;

            int maxBalloons = Integer.MAX_VALUE;
            maxBalloons = Math.min(maxBalloons , map.get('b') );
            maxBalloons = Math.min(maxBalloons , map.get('a') );
            maxBalloons = Math.min(maxBalloons , map.get('l') );
            maxBalloons = Math.min(maxBalloons , map.get('o') );
            maxBalloons = Math.min(maxBalloons , map.get('n') );

        return maxBalloons;
    }
}
