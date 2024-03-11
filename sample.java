class sample{
    public static void main(String[] args){
        DisplayOverloding obj = new DisplayOverloding();
        obj.disp('a');
        obj.disp('a',10);
        obj.disp(10,'a');
        obj.disp(10);
        obj.disp(10,10);
    }
}