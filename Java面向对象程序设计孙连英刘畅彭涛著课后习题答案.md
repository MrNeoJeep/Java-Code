## 习题1

\1.    面向对象程序设计语言的特点是什么？

答：封装性、继承性和多态。

\2.    谈谈类和对象的联系和区别。

 

\3.    编译和运行Java程序的命令是什么？

\4.    MyDemo.java文件中定义了两个类，分别是：Person和Student。编译后将生成几个类文件（**.class）？文件名是什么？

## 习题2

\1.   判断下列语句的对错

（1）一个标识符可以是任何数字和字母的序列。

（2）在Java中，保留字和预定义的标识符之间没有区别。

（3）取模运算符的操作数必须是整数。

（4）如果a的值为4，b的值为3，则在执行了a=b；b的值仍为3。

（5）在输出语句中，换行符可能是字符串的一部分。

答：（1）F（2）F（3）T（4）T（5）T

\2.   以下哪个是Java应用程序main方法的有效定义（A）。

A．public static void main(String args[])

B．public static void main()

C．public static void main(String args)

D．public static main(String a[])

\3.   写出表达式的运算结果，设 a=3, b=4

b !=3 && a * 2 > a + b

 

false

 

\4.   给出以下内容的输出结果。

a. System.out.println(‘b’);

b. System.out.println(‘a’+‘b’);

c. System.out.println((char) (‘b’+3));

a.答：b

b.答：195

c.答：e

\5.   假设x、y、z均为int型变量，且x=2, y=5 , z=9。在执行了下面每个语句后将输出什么？

（1）System.out.println(“ x = ” + x + “ ,y = ” + y + “ ,z = ” + z);

（2）System.out.println(“x + y = ” + ( x + y ));

（3）System.out.println(“ sum of ” + x + “and ” + z + ” is ” + ( x + z ));

（4）System.out.println(“z / x = ” + (z / x));

（5）System.out.println(“2 times” + x + ” = ” + ( 2 * x ));

\6.    判断以下语句是否有误，如果有错，请指出。

（1）if (a > b ) then c=0;

（2）if a > b { c=0;}

（3）if (a = b) c=0;

（4）if (a  > b) c=0 else b=0;

答：

(1)  x=2,y=5,z=9

(2)  x+y=7

(3)  sum of2and 9is 11

(4)  z/x=4

(5)  2 times2=4

\7.   给出下列语句执行后j 的值是多少。假设i和 j都是整数。

（1）for (i=0, j =0 ; i<10 ; i++) j +=i;

（2）for (i=0, j =1 ; i<10 ; i++) j +=j;

（3）for (j =0; j<10 ; j++) j +=j;

（4）for (i=0, j =0;  i<10; i++) j +=j++;

## 习题3

\1. 判断下列说法是否正确

（1）方法的返回值只能返回一个值。

（2）方法的参数允许有多个。

（3）方法执行到return语句时，将立即退出。

（4）方法的形参和实参，名称必须相同。

（1）F

（2）T

（3） T

（4） F

\2. 语句int（Math.random（） * 6）+ 1的作用是什么（A）。

 A产生1 — 6之间的随机数   B产生100 — 600之间的随机数

   C产生10 — 60之间的随机数  D产生1000 — 6000之间的随机数

\3. 下面的方法头哪一个有效？如果无效，请解释原因。

（1）public static one(int a, int b)

（2）public static int thisone(char x)

（3）public static char another(int a, b)

（4）public static double yetanother

答：

（1）public static one(int a, int b)无效，该方法没有返回值，没有返回值时需要声明返回类型为void。

（2）public static int thisone(char x)有效

（3）public static char another(int a, b)无效，参数b类型没有声明

（4）public static double yetanother。无效，方法即使没有参数也要保留小括号（）。

\4. 如下方法，调用stery（5）时返回值是(D )

public staic int stery（int n）{

if （n == 0）

 return 1;

else

  return 3 * stery( n - 1);

}

A.0  B.3  C.81  D.243  E.6561

\5. 下面的程序段中，请指出方法头、方法体、形参、实参、方法调用和局部变量。

 

  public  class Exercise{   public staic void main(String [] args){    int x=0;    double y=0;    char z=’’;    hello(x,y,z);  …….   hello( x + 2,  y-2.4),’S’);  }  public static  void hello(int first, double second, char ch){     int num;     double y;      ……  }  }  

 

答：

方法头：public static void hello(int first, double second, char ch)。

方法体：方法头控制的{}之间为方法体。

形参：int first, double second, char ch

实参：num、y。

方法调用：hello(x,y,z);hello(x+2, y-2.4),’S’);

局部变量：方法中的{int num; double y;}

 

习题4

下面的数组定义哪些是正确的？错误的请修改正确。

（1）int a[]=new int[3];T

（2）int[] a;a={1,2,3,4,5};T

（3）int[] a=new int[3]{1,2,3};F，应改成int[] a=new int[3]，a[0] = 1;a[2] = 2;a[3] = 3;

（4）int a[][]=new int[10,10];F, 应改成int a[][]=new int[10][10];

（5）int a[10][10]=new int[][];F, 应改成int a[][]=new int[10][10];

（6）int a[][]=new int[10][10];T

（7）int[] a[]=new int[10][10];T

（8）int[][] a= new int[10][10];T

 

\2. 编写用于完成以下操作的Java语句：

（1）声明一个有16个元素的int型数组alpha

（2）输出数组alpha的第10个元素

（3）将数组alpha第5个元素值设为53

（4）将数组alpha第9个元素的值设置为第6个和第11个之和。

（5）输出数组alpha，并且每.行显示4个元素。

 

答：

（1） int alpha[16]

（2）System.out.print(alpha [10]+ " ");

（3）alpha[5]=53;

（4）alpha[9]= alpha[6]+ alpha[11]

（5）

for (int i = 0; i <alpha.length; i++) { 

​    System.out.print(alpha[i] + " ");

​    if(i%4==3)

System.out.print ("\n");

  }

 

 

\3. 下面程序的运行结果是（ c）

public static void main(String a[]){

int x=30; 

​    int[] numbers=new int[x]; 

​     x=60; 

System.out.println(numbers.length);

} 

A．60   B．20   C．30   D．50

\4. 使用arraycopy()方法将数组a复制到b正确的是（A ） 

A．arraycopy(a,0,b,0,a.length)  B．arraycopy(a,0,b,0,b.length)  

C． arraycopy(b,0,a,0,a.length)  D．arraycopy(a,1,b,1,a.length)

## **习题****5**

\1. 在一个UML类图中，下面的A.B.C中都应该存放什么内容？

| A    |
| ---- |
| B    |
| C    |

 

答：

| 类名 |
| ---- |
| 属性 |
| 操作 |

 

 

\2. 请说明对象和类之间的关系。如何定义类？如何声明对象？如何创

建对象？ 

 

类和对象的区别如下所示：

类是概念模型、模板或原型；

对象是根据模型创造的真实的实体；

类是实体对象的模型，是抽象的、不具体的概念。通过定义这个模型，可以规定实体对象所具有的属性和行为。

类是对某一类事物的描述，是抽象的、概念上的定义。

对象的声明：类名对象名;

对象的创建：类名对象名=类名（）;

 

\3. 构造方法和成员方法有什么不同。

 

答：

类中包括属性和方法，分别称为成员变量和成员方法。

构造方法是类的一种特殊方法，它的特殊性主要体现在如下的几个方面：

（1）构造方法的方法名与类名相同。

（2）构造方法没有返回值，不加void修饰，也不能在方法中用return语句。

（3）构造方法的主要作用是初始化成员变量。

（4）构造方法不能由编程人员显式调用。在创建一个类的新对象的同时，系统会自动调用该类的构造方法，并且只调用一次。

 

\4. 应用于属性和方法时，static修饰符的作用是什么？

答：

用static关键字修饰的成员变量或方法称为静态成员或类成员，它不依赖于特定对象。系统只在实例化类的第一个对象时，为静态成员分配内存，以后再生成类的实例对象，将不再为静态成员分配内存，不同对象的静态成员将共享同一内存空间。

 

\5. 假设给出下面的语句：

Clock firstClock=new Clock(2,4,54);

Clock secondClock=new Clock(6,33,9);

 firstClock= secondClock;

接下来的输出语句输出内容相同吗？为什么？

firstClock.print();

secondClock.print();

 

答：相同，因为firstClock和secondClock的类型相同，当执行完firstClock= secondClock后firstClock和secondClock其实已经是一样了，所以执行相同的方法输出结果也一样;

 

\6. 考虑下面的声明：

  public class  xClass  {    private int u;    private double w;       public xClass()    {       }   public xClass(int a, double b)  {           }     public void  func()  {      }     public void  print()  {       }  }  

（1）xClass类有多少个私有成员？

（2）xClass类有多少个构造方法？

（3）定义func成员方法，将u的值设置为0，将w的值设置为15.3.

（4）定义print成员方法以输出u和w的内容。

（5）定义xClass类的默认构造方法，将实例变量u初始化为0。

（6）定义xClass类的带参数构造方法，将实例变量u初始化为a的值，并将v初始化为b的值。

（7）编写创建一个xClass类型的对象t，并将对象t的各个实例变量分别初始化为30，82.6。

 

 

答：

（1）xClass类有多少个成员？2个成员

（2）xClass类有多少个私有成员？2个

（3）xClass类有多少个构造方法？2个

（4）定义func成员方法，将u的值设置为0，将w的值设置为15.3.

public void func(){

 u = 0;

 w = 15.3;

}

（5）定义print成员方法以输出u和w的内容。

public void print(){

System.out.println("The value of u is :" + u);

System.out.println("The value of w is :" + w);

}

（6）定义xClass类的默认构造方法，将实例变量u初始化为0。

 public xClass()

{ 

   u = 0;

}

 

（7）定义xClass类的带参数构造方法，将实例变量u初始化为a的值，并将w初始化为b的值。

public xClass(int a, double b)

{ 

  u = a;

  w = b;

}

（8）xClass xTest = new xClass(30,82,6);

 

 

7.指出下面代码有哪些错误。

| class A{  int i;  public void   A(int j){   int i = j;  }  } | public   class Test{  public  static void main(String args[]){    A   a= new A(3);  }  } |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
|                                                              |                                                              |

 

\8. 下面程序的输出结果是什么？

​    public   class Test{     int   i ;     static int s;     public Test(){     i++;     s++;  }   public static void main(String args[]){     Test   a = new Test();  Test b = new Test();   Test   c = new Test();  System.out.println(“a.i is ” + a.i + “b.i is ” +b.i + “c.i is ” + c.i);  }  }  

 

 

习题6

\1.   解释public和private在访问属性和方法上的区别。

答：

public修饰成员变量或成员方法，就意味着是公开的，任何类的成员方法均可访问，因此也称为接口访问权限。

private是私有的，只能在类内部使用，其它类不能访问。对private修饰的属性进行读写操作，只能通过它公开的get/set方法。

\2.   类（内部类除外）的访问权限有哪些？

答：类（内部类除外）的访问权限仅有两个：包访问或是public。类不可以被private和protected修饰，内部类除此之外。

 

\3.   什么是包？如何将文件打包？如何导入包？

答：类文件都放在同一个目录下，当文件很多时，可能会产生命名冲突的矛盾。为解决这种矛盾，Java采用包（package）来管理类名空间。

具有相似功能的类一般用打包语句（package）组织到一个包（文件夹）中。不同功能的类放在不同包。

用关键字import导入所在的包。例如，语句将引入包中所有的类：import java.util.*;

\4.   如何创建当前时间对象？如何显示当前时间。

答：构造方法可以用参数pattern指定的格式创建一个对象，它是普通字符和格式符组成的字符序列。

显示当前时间的主要代码及注释：

Date dt=new Date();//如果不需要格式,可直接用dt,dt就是当前系统时间

DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//设置显示格式

String nowTime="";

nowTime= df.format(dt);

//用DateFormat的format()方法在dt中获取并以yyyy/MM/dd HH:mm:ss格式显示

 

\5. 考虑下面的类：

  public  class SomeClass{   private int x=10;      public void setX(int xIn){    x=xIn;  }     public int  getX(){   return x;  }  }  

 

下面这段程序的输出结果是什么？

  public  class TestClass{   private static void test(int z, SomeClass  classIn){  z=50;  classIn.setX(100);  }   public static void main(String args[]){  int y=20;  SomeClass  myObject=new SomeClass();     test(y,myObject);  System.out.println(y);  System.out.println(myObject.getX());  }  }  

答：

20

100

习题7

\1.    UML类图中如何描述继承关系，Java中使用哪个关键字声明一个类是另一个类的子类？

extends关键字。

\2.    重载方法和重写方法有何区别？

答：

方法重载是指方法名和方法的返回类型都相同,但方法参数不一样。参数不一样体现在参数个数和参数类型不一样。

方法重写是相对继承而言的。重写的方法名返回类型,参数类型和参数个数都要求和父类中的一样.这是重载和重写形式上的区别.

当类继承某个类的时候 .一些属性和方法也被继承过来了.这样就可以用子类对象调用父类中的某个方法.但如果你对父类中的方法不满意,便可以对父类中的方法进行重写.实现你想要的功能。

 

\3.    7.2节中，GoldCustomer类的属性有哪些，构造方法如何对这些属性进行初始化？

答：

消费者的姓名（Name），已缴纳金额（totalMoneyPaid）和已经购买商品的总额（totalGoodsReceived）、信用额度。

方法重载、方法重写。

 

\4.    画出例7.11中各个类的UML关系图。

![img](D:\Typora图片\clip_image002.gif)

\5.    什么是抽象方法？

答：父类把方法声明为abstract，没有具体实现，这样的方法称为抽象方法。

 

\6.    抽象类和接口之间有何差别？

答：

一个抽象类中的所有方法都是抽象的，就可以使用接口。接口是抽象方法和常量值的定义的集合。从本质上讲，接口是一种特殊的抽象类，这种抽象类中包含常量和方法的定义，而没有变量和方法的实现。解释子类如何调用父类的构造方法。

 

\7.    解释子类如何调用父类的构造方法。

举例说明：子类重写了父类的dispatchGoods方法。

第一次调用dispatchGoods方法，firstCustomer是Customer类的对象，因此调用隶属于Customer类定义的方法。第二次调用dispatchGoods方法，secondCustomer对象调用，使用的是GoldCustomer类定义的方法。调用时，通过操作对象来区分。

 

\8.    如果子类重写了父类的某个方法，那么在子类中如何调用父类中被重写的方法？

例如：在父类的原始方法中，if语句只要检查余额是否大于商品金额即可。而在子类中还需考虑信用额度条件。因此，子类和父类方法体内的操作不同。子类重写了父类的dispatchGoods方法。

 

\9.    下面程序的输出结果是什么？



   class   A{     public A(){       System.out.println(“The default constructor of A is  invoked.”);  }  class B extends   A{     public B(){       System.out.println(“The default constructor of B is  invoked.”);  }  public class C {    public  static void main(String args[]){}    B b= new  B();  }  }  

The default constructor of B is invoked.

\10.  下面程序的输出结果是什么？



| class   A {     int x;     public String toString(){       return “x is ”+ x;  }  } | public   class Test{     public static void main(String args[]){      Object a1 = new A();      Object a2 = new Object();  System.out.println( a1 );  System.out.println( a2 );  }  } |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
|                                                              |                                                              |

 

## 习题8

\1.    什么是动态绑定？

答：

将方法调用和方法主体连接到一起称为绑定。在程序运行期间进行绑定，称为后期绑定，后期绑定也称为“动态绑定”或“运行时绑定”。

 

\2.    解释为什么父类句柄可以引用子类对象，而子类句柄不可以引用父类对象？

答：

父类句柄可以引用子类对象：是由继承关系保证的。父类和子类的关系是一般和特殊的关系，子类 is a kind of 父类。声明为父类的句柄当然可以指向它的一种特殊子类。

子类句柄不可以引用父类对象：Pen句柄声明是Pencil类型，因此可以指向Pencil类型的对象。如果引用其它类的对象，则产生编译错误，不能通过编译。

 

\3.    instanceof运算符的作用是什么？

答：instanceof运算符用于判断对象是不是某个类或者是子类的一个实例。

\4.    假设Fruit, Apple, Orange, GoldenDelicious，Macintosh类已定义，关系如下图所示。

![img](D:\Typora图片\clip_image004.gif)

有以下操作：

 



  Fruit fruit =new GoldenDelicious();  Orange orange=new Orange();  

 

请回答下列问题：

（1）  fruit是 instanceof Fruit 吗？

（2）  fruit是 instanceof Orange 吗？

（3）  fruit是 instanceof Apple 吗？

（4）  fruit是 instanceof GoldenDelicious吗？

（5）  fruit是 instanceof Macintosh吗？

（6）  orange是 instanceof Fruit 吗？

（7）  orange是 instanceof Orange吗？

（8）  orange是 instanceof Apple 吗？

（9）  语句：Orange p= new Apple() 合法吗？

（10） 语句：Macintosh p= new Apple() 合法吗？

（11） 语句：Apple p= new Macintosh () 合法吗？

答：

（1）  fruit是 instanceof Fruit 吗？是

（2）  fruit是 instanceof Orange 吗？不是     

（3）  fruit是 instanceof Apple 吗？是     

（4）  fruit是 instanceof GoldenDelicious吗？是

（5）  fruit是 instanceof Macintosh吗？不是

（6）  orange是 instanceof Fruit 吗？是       

（7）  orange是 instanceof Orange吗？是

（8）  orange是 instanceof Apple 吗？不是     

（9）  语句：Orange p= new Apple() 合法吗？不合法

（10） 语句：Macintosh p= new Apple() 合法吗？不合法

（11） 语句：Apple p= new Macintosh () 合法吗？合法

## 习题9

\1.   什么是容器，什么是组件？组件与容器有何区别？

答：

容器类是GUI组件，用于盛装其他GUI组件的容器。

容器可以添加其他组件形成复合组件，比如在panel里可以添加button。容器本身也是一种组件

 

\2. Panel的默认布局管理器是（ A ）。

A．FlowLayout    B．CardLayout   

C．BorderLayout   D．GridLayout

3.事件处理机制能够让图形界面响应用户的操作，主要包括（ C）。 

A.事件        B.事件处理

C.事件源       D.以上都是

4.（D ）布局管理器使容器中各个构件呈网格布局，平均占据容器空间。

A. FlowLayout     B. BorderLayout

C. GridLayout     D. CardLayout

 

## 习题10

\1.    try-catch语句的作用是什么，catch语句的顺序与异常处理有何关系？

异常处理.

Java运行时系统将按照catch语句的顺序依次进行匹配，直到找到匹配的catch语句为止。所谓“匹配”是指：

catch语句中处理异常类型和生成异常对象完全一致；

catch语句中处理异常类型是生成异常对象的父类。

 

\2.    观察下面程序，回答后面的问题：

   public  class  ExceptionQ {   public  static void main(String[] args){  int[] someArray = {32, 9,5,40};  int position=getPosition();  display(someArray, position);  System.out.println(“End of program”);  }  private static int getPosition(){    System.out.println(“Enter  array position to display”);     String positionEntered=Scanner.next();     return Integer.parseInt(positionEntered);  }  private static void display(int[] arrayIn, int posIn){   System.out.println(“Item at this position  is: ”+ arrayIn[posIn]);  }  }  

 

(1)  该程序会出现编译错误码？

会

(2)  哪个方法会抛出异常？

getPosition()方法

(3)  判断可能抛出异常的异常的名称，并说明在什么情况下将会抛出该异常。

静态和非静态方面的异常，当在静态方法中使用非静态成员的时候就会报改异常。

 

\3.    什么情况下需要定义自己的异常类？

答：一定是Throwable的直接或间接子类，一般不用自定义异常类做父类。

4．throws的作用是什么? 它与throw的区别是什么?

  throw则是指抛出的一个具体的异常类型。

通常在一个方法（类）的声明处通过throws声明方法（类）可能抛出的异常信息，而在方法（类）内部通过throw声明一个具体的异常信息。

 

习题11

\1.   指出下列集合类的不同之处：List类、Set类、Map类

答：

List接口是元素有序并可重复的集合。因此，可以利用List的下标位置找到元素，它的下标从0开始。

Set接口是一种不包含重复元素的Collection，即任意的两个元素e1和e2都满足e1.equals(e2)=false，Set中最多有一个null元素，并且元素的顺序不重要。

Map接口不是继承自Collection接口，Map提供key到value的映射。Map不能包含相同的key，每个key只能映射一个 value。在Map中，顺序并不重要，但关键字是唯一的。

 

\2.   什么时候适合使用LinkedList而不用ArrayList？

答：

有null元素，可用堆栈（stack），队列（queue）或双向队列（deque）时。

 

\3.   考虑如下代码：

Map<String,Student> javaStudents = new HashMap<String,Student> (); 

(1)  为什么将对象的类型声明为Map类型，而不是HashMap类型？

Library集合类中只有一个属性books，它是Map类型，Map的关键字声明为String对象，表示属性ISBN；Map的value值声明为Book对象。

 

(2)  尖括号中的内容有什么作用？

这里用到了泛型，限定了map中元素的类型。

 

(3)假定上面的语句已经创建了javaStudents对象，为什么下面这行代码会导致编译错误？

javaStudents.put(“C123”,”Fadi”);

参数个数多了

 

\4.   请描述Map的数据结构。

答：

Map接口不是继承自Collection接口，Map提供key到value的映射。Map不能包含相同的key，每个key只能映射一个 value。在Map中，顺序并不重要，但关键字是唯一的。通常将Map看成一个查找表，key（关键字对象）用于查找。

Map提供了查询、更新、获取键值的集合和集合的值。其中更新方法有：clear 、put.、putAll 和remove。

 

## 习题12

\1.    字节数据流与字符数据流有什么不同？

答：

字节（byte）流（InputStream类和 OutputStream类），一次读写8位二进制数。所有的字节输入流都继承了InputStream抽象类，字节输入流都继承了 OutputStream抽象类。

字符（Character）流（Reader类和Writer类），一次读写16位二进制数。

\2.    程序中如何获取当前工作目录？

答：

//获取文件名 

System.out.println("File name: " + fc.getName());

\3.    程序中如何判断文件是否存在，是否可读，是否可写？

答：

//文件是否可写

System.out.println("Can Write? " + fc.canWrite());

//文件是否可读

System.out.println("is readable?: " + fc.canRead());

\4.    如何对文件重命名和创建新的路径？

答：

f.renameTo(new File(fl.getAbsolutePath() + "\\" + filename.replace

File dirFile = new File(dirPath);

\5.    解释Serializable接口的作用。

答：

要实现对象序列化，Serializable接口没有定义任何方法，只是一个特殊的标记，用来告诉Java编译器，这个对象参加了序列化协议，可以把它序列化。

\6.    简要说明String类下列方法的作用并给出示例程序：

  public boolean matches(String regex);

  public String replaceFirst(String regex, String replacement);

  public String replaceAll(String regex, String replacement);

  public String[] split(String regex, int limit);

  public String[] split(String regex);

 

## 习题13

\1.  判断下列说法是否正确

（1）线程就是程序。

（2）多线程是指一个程序的多个执行流。

（3）共享数据的所有访问都必须使用synchronized加锁。

（4）Thread类的子类也实现了Runnable接口。

（5）mt.setPriority(11)可以将mt线程对象的优先级设为11。

答案：

（1）F

（2）T

（3）F

（4）T

（5）T

（6）F

（7）F

\2.  哪个关键字可以对对象加互斥锁？( B)

A.transient  B.synchronized  C.serialize  D.static

\3.  下列哪个方法可用于创建一个可运行的类?(A B)

A．public class X implements Runable { public void run() {……} }

B. public class X implements Thread { public void run() {……} }

C. public class X implements Thread { public int run() {……} }

D．public class X implements Runable { protected void run() {……} }

\4.  下面哪个选项不会直接引起线程停止执行？(A )

A. 从一个同步语句块中退出来 

B．调用一个对象的wait方法

C．调用一个输入流对象的read方法

D．调用一个线程对象的setPriority方法

\5.  下列不属于线程生命周期状态的是( D )

A. 新建状态    B.可运行状态

C. 运行状态    D.解锁状态

\6.  下列程序的输出结果是（ B  ）

class C implements Runnable{

 public void run() {

  for(int a=3;a<=10;a++){

​    if(isPrime(a))

​      System.out.print(a+"\t");

  }

}

public boolean isPrime(int n){

  boolean b=true;

  for(int i=2;i<n-1&&b;i++){

​    if((n%i)==0)

​      b=false;

}

  return b;

 }

}

public class Test{

public static void main(String args[]){

  Thread t=new Thread(new C());

  t.start();

 } }

 

A、2 4 6   B、3 5 7   C、3 6  9   D、2 5 8

 

\7.  下列程序的输出结果是（ D ）。

public class Test {

 public static void main(String args[]) {

  new Test();

 }

 Test() {

  Test t1 = this;

  Test t2 = this;

  synchronized (t1) {

​    try {

​      t2.wait();

​      System.out.println("DONE WAITING");

​    } catch (InterruptedException e) {

​      System.out.println("INTERRUPTED");

​    } catch (Exception e) {

​      System.out.println("OTHER EXCEPTION");

​    } finally {

​      System.out.println("FINALLY");

​    }

  }

  System.out.println("ALL DONE");

 }

}

 

A.输出“ALL DONE”

B.输出“INTERRUPTED”

C.输出“DONE WAITING”

D.编译通过，但是不输出任何字符串

 

## 习题14

\1.   请简要说明什么是IP地址和端口号。

答：

IP地址是给Internet上的每一台计算机分配一个地址。IP地址只能保证把数据送到指定的计算机。

端口号区分不同的网络服务，保证这些数据交给这台计算机的哪一个网络应用程序。

\2.   请简要说明什么是Socket，一个Socket由哪几个部分组成？

答：

Socket是网络驱动层提供应用程序编程的一种接口和机制。Socket是两个实体之间进行通信的有效端点。Socket套接字是应用程序和网络协议的接口。

一个socket是由4部分组成,sip, sport, dip, dport。

 

\3.   TCP协议是哪一层的协议？其主要特点是什么？JDK提供了哪几个类用于TCP协议的编程？

答：

传输层通信协议。

TCP协议是一种面向连接的、可靠的、基于字节流的传输层通信协议。

ServerSocket（服务器端）和Socket（客户机端）。

\4.   UDP协议是哪一层的协议？其主要特点是什么？JDK提供了哪几个类用于UDP协议的编程？

答：

传输层通信协议。

UDP是无连接的通信协议。

类DatagramSocket和类DatagramPacket。

 