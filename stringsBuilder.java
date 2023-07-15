public class stringsBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        //char at index 0
        System.out.println(sb.charAt(2));

        //set char at index 0
        sb.setCharAt(2, 'p');
        System.out.println(sb);
        // sb.insert(0, 's')
        sb.insert(0, 'S');
        System.out.println(sb);
        //sb.delete the extra 'n'
        sb.delete(2, 3);
        System.out.println(sb);

    }
    
}
