package day14_stack_ques.basic;

//stack will not be full
public class DynamicStack extends CustomStack {

    public DynamicStack(){
        super();//it will call CustomStack
    }
    public DynamicStack(int size){
        super(size);
    }
    //if we want to puch of dynamaic class we noeed to override the custome stack

    @Override
    public boolean push(int item) {
        if(this.isFULL()){
            //double the array size
            int[] temp=new int[data.length*2];
            //copy all previous items in new data
            for(int i=0;i<data.length;i++){
                temp[i]=data[i];
            }
            data=temp;//reassigining the data stack as main
        }
        //insert iteem
        //at this point we know that array it is not full
        return super.push(item);//using the original one
    }
}
