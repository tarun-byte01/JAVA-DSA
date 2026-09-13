class Main {
    public static void main(String[] args) {

        String s = "Hello";

        for(int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
    }
}

Output:

H e l l o
  
Pattern to remember:

for(int i = 0; i < s.length(); i++) {
    System.out.println(s.charAt(i));
}
