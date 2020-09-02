package GetSatckMin;

import java.util.Stack;

/**
 * @PACKAGE_NAME: GetSatckMin
 * @NAME: Stack1
 * @USER: 代学婷
 * @DESCRIPTION:  实现一个最小栈
 * @DATE: 2020/9/2
 **/
//用两个栈实现一个是正常的插入删除，一个是保存最小值的插入删除
public class Stack1 {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public  Stack1(){
        this.stackData=new Stack<>();
        this.stackMin=new Stack<>();
    }

    //添加
    public void push(Integer newValue){
        if (this.stackMin.empty()){
            this.stackMin.push(newValue);
        }else if (newValue<this.stackMin.peek()||newValue==this.stackMin.peek()){
            this.stackMin.push(newValue);
        }

        this.stackData.push(newValue);
    }

    //弹出
    public Integer pop(){
        if (this.stackData.empty()){
            throw new IndexOutOfBoundsException("栈为空");
        }
        int value=this.stackData.pop();
        if (value==this.stackMin.peek()){
            this.stackMin.pop();
        }
        return value;
    }

    //  获取当前栈的最小值
    public Integer getMin(){
        if (this.stackMin.empty()){
            throw new IndexOutOfBoundsException("最小栈值为空");
        }
        return this.stackMin.peek();
    }
}
