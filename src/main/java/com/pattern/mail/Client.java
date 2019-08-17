package com.pattern.mail;

import sun.jvmstat.perfdata.monitor.PerfStringVariableMonitor;

/***
 *
 *
 * 发送邮件时时候注意事项
 * 在使用JavaMail 包所提供了的功能发送邮件时，要循环使用MaxList 给出的SMTP 服务器进行邮件发送，同时注意捕捉抛出的
 * 的javax.mail.SendFailedException异常，如果没有捕捉到这个异常，就表明发送工作的成功的，应当终止循环，如果捕捉到这个异常
 * 就表明发送工作，应当继续循环尝试一下，SMTP服务器
 *
 * 与多例模式的关系
 * 最后值得指出提是，MXList实际上是一个将单例模式应用到一个聚集上的例子，MXList本身是一个聚集，向外界提供聚集管理方法，如
 * elementAt()和size()等，而此聚集本身是一个单例
 *
 * 熟悉多例模式的读者可能会问，这是不是与多例模式有相似之处，多例模式难道不是一个聚集吗？
 * 在多例模式中，聚集用来登记和管理多例类自身的实例，MXList作为一个聚集包含的元素是MailServer对象，而不是它自己，它们之间的
 * 关系是一个多例对象与单例聚集对象的关系，两者虽然相象，但是本质
 *
 * 迭代子模式的应用
 * 关于迭代模式的一般性讨论，请参见本书的迭代子模式一章
 * Attributes 是一个聚集对象，因为它像所有的聚集一样，通过一个工厂方法提供了一个接口的对象，NamingEnumeration的类图下图所示
 * 从上图可以看出，NamingEnumeration接口是Enumeration接口的子接口，一旦不再需要，就应当调用close()方法将资源释放掉，如果一个
 * NamingEnumeration类型的迭代了对象迭代到了最后的元素之后，也就是说当hasMore()方法返还fasle时，就不必再调用close()方法释放
 * 资源，因为迭代的对象会自动将占用资源释放掉。反过来，如果的迭代没有到达最后一个元素，反过来，如果迭代没有到达了最后的一个元素之前
 * 因此迭代子对象会自动将占用的资源释放掉，如果迭代没有最后一个元素之前，就中止，那么客户端当明显用close()方法以便释放资源
 * 需要注意的是，调用了close()方法后，这个迭代对象就不能再使用，如果客户端面再次需要NamingEnumeration类型的对象，就必须调用
 * 工厂方法getAll()，以便重新产生这个对象
 * 问答
 * DNS服务器的MX记录并不是真正的静态的，能否修改一下上面的设计，让MXList类能够每隔24小时进行一次查询，而不是仅初始化时做了一次
 * 关键部分，可以使用JNDI 查询javax.sql.DataSource吗? 请给出源代码关键部分。
 * 请给出一个EMailManager类的源代码， 这个类允许客户端传入收人
 * 这是可以的，只需要加加入一个新的状态用于记录第一次DNS查询时间即可，在用户调用MX记录表的时候，将实时与记录中的时间加以比较，如果时间
 * 差大于某一个数值时，系统就重新对DNS查询并重建MX记录表，然后再回应客户端的请求。
 *
 * 单例类一般情况下最多只有一个实例，请参见下图所示的单例类结构图。
 * 但是单例模式的精神是允许有限个实例，并不是仅仅允许一个实例，这种情况下，允许多个限多个实例并向整个JVM提供自己的实例类叫做多例类，这种
 * 模式叫做多例模式，请参见下图所示的多例类的结构图
 * 本章就需要用多例模式来实现资源对象，需要构造出能提供有限个实例，每个实例各不相同的属代码
 * 有限多例类
 * 一个实例数目上限的多例类书民实例的上限当做逻辑的一部分，并建造多例类的内部的，这种多例模式路段有限多例模式，
 * 比如每一
 *
 *
 */
public class Client {


    private static MXList mxl;

    public static void main(String[] args)  throws Exception{

        double a=  17623 + 5579.19;
        System.out.println(a );


        /*mxl = MXList.getInstance("dns://dns01390.ny.jeffcorp.com","jeffcorp.com");
        for(int i = 0 ;i < mxl.size() ; i ++ ){
            System.out.println((1 + i ) + ")proority=" + mxl.elementAt(i).getPriority() + ",name = " + mxl.elementAt(i).getServer());
        }
*/




    }
}
