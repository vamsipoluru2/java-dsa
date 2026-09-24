package day14_stack_ques.basic;

public class dynamicQueue extends CircularQueue{
    public dynamicQueue(){
        super();
    }
    public dynamicQueue(int size){
        super(size);
    }

    @Override
    public boolean insert(int item) {

        if(this.isFULL()){
            //double the array size
            int[] temp=new int[data.length*2];
            //copy all previous items in new data
            for(int i=0;i<data.length;i++){
                temp[i]=data[(front+i)% data.length];// the i starts from 0 but front may be at the middle and also the elements
//                i	(front + i) % data.length	data[(front + i) % data.length]	Stored in temp[i]
//                0	(3 + 0) % 5 = 3	10	temp[0] = 10
//                1	(3 + 1) % 5 = 4	20	temp[1] = 20
//                2	(3 + 2) % 5 = 0	30	temp[2] = 30
//                3	(3 + 3) % 5 = 1	40	temp[3] = 40
//                4 (3 + 4) % 5 = 2	(empty/null)	temp[4] = null
            }
            front=0;
            end=data.length;// old length
            data = temp; // now data points to the new, bigger array //reassigning the data stack as main
        }
        //insert iteem
        //at this point we know it is not full
        return super.insert(item);
    }
}
