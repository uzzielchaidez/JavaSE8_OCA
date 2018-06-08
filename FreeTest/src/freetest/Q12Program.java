package freetest;

interface Q12Program{
    String type = "A";
    
    void fly();
    
    default String getType(){
        return type;
    }
}
