package easy;

import java.util.Stack;

public class ImplementQueueUsingStacks_232 {
    class MyQueue {

        Stack<Integer> st1;
        Stack<Integer> st2;

        /** Initialize your data structure here. */
        public MyQueue() {
            st1 = new Stack<>();
            st2 = new Stack<>();
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            st1.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
            int res = st2.pop();
            while (!st2.isEmpty()) {
                st1.push(st2.pop());
            }
            return res;
        }

        /** Get the front element. */
        public int peek() {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
            int res = st2.peek();
            while (!st2.isEmpty()) {
                st1.push(st2.pop());
            }
            return res;
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return st1.isEmpty();
        }
    }

    /**
     * Your MyQueue object will be instantiated and called as such: MyQueue obj =
     * new MyQueue(); obj.push(x); int param_2 = obj.pop(); int param_3 =
     * obj.peek(); boolean param_4 = obj.empty();
     */
}

// Implement the following operations of a queue using stacks.

// push(x) -- Push element x to the back of queue.
// pop() -- Removes the element from in front of queue.
// peek() -- Get the front element.
// empty() -- Return whether the queue is empty.
// Example:

// MyQueue queue = new MyQueue();

// queue.push(1);
// queue.push(2);
// queue.peek(); // returns 1
// queue.pop(); // returns 1
// queue.empty(); // returns false
// Notes:

// You must use only standard operations of a stack -- which means only push to
// top, peek/pop from top, size, and is empty operations are valid.
// Depending on your language, stack may not be supported natively. You may
// simulate a stack by using a list or deque (double-ended queue), as long as
// you use only standard operations of a stack.
// You may assume that all operations are valid (for example, no pop or peek
// operations will be called on an empty queue).