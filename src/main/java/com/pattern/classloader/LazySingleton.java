package com.pattern.classloader;

public class LazySingleton  {
    private static LazySingleton m_instance = null;



    private LazySingleton(){

    }

    /***
     * 静态工厂方法
     * 返回lazySingleton类的唯一实例
     *
     * 按照多线程的原理和双重检查成例的预想方案，它们是不可以省略的，本节不打算讲解的原因在于双重检查成例在java编译器中根本不成立
     * 双生检查成例对java语言编译器不成立
     * 令人吃惊的是，在C语言里得到普遍应用的双重检查成例在多数的java语言编译器里面并不成立 ，上面使用了双重检查成全懒汉式单例类，不能
     * 赋值的顺序不可预料，如果一个线程在没有同步的情况的条件下读取m_instance引用，并调用这个对象的方法的话，可能会发现对象的初始化的过程
     * 沿未完成，从而造成崩溃
     *
     *
     * 一般而言，双重检查成例能在java编译下工作，这种可能当然不会排除，但是除非读者对此有特别的兴趣，建义不要在这上面花费太多的时间
     * 单例
     *
     *
     * 单例模式的使用
     *  不能忘记本书引入这个例子是为了说明单例模式的使用，因此，有必要借此机会强调一为什么
     *
     *  命名-目录服务
     *  一个生活中的命名，目录服务的例子就是电话台提供的电话目录的查询服务，这个服务将把例在电话簿上的商家名字，地址和电话联系起来
     *  计算机的命名，目录服务是计算机系统中的一个基本工具
     *
     *
     * @return
     */
    public static LazySingleton getM_instance() {
        if (m_instance == null) {
            synchronized (LazySingleton.class) {
                if (m_instance == null) {
                    m_instance = new LazySingleton();

                }
            }
            return m_instance;
        }


        return null;

    }

        // 上面代码乍看起来是一个懒汉式单例类， 仔细一看，发现有一个公开的构造子，由于外界可以使用构造子创建出任意多个此类的实例，这违背了单例
        // 类只能有一个或有限个实例的特性，因此这个类不是完全的单例类，这种情况有时会出现，比如javax.swing.TimerQueue便是一例，请参见，观察
        // 模式与Swing定时器，一章
        // 造成这种情况出现的原因有多个可能
        // 初学者的错误，许多的初学者没有认识到构造子不能公开的，因此犯下这个错误，有些初学者java语言的学员甚至不知道一个java类的构造子是不能
        // 公开的，在这种情况下，设计师可能会通过自我约束，也就是说不去调用构造子的办法，将这种不完全单例类的使用中作为一个单例使用
        // 在这种情况下，一个简单的矫正办法，就是将公开的构造子改为私有的构造子
        // 当初出于考虑不周，将一个类设计成单例类，后来发现此类应当有一个或者多个实例，为了一个弥补错误，干脆将构造子改为公开的，以便在需要多个
        // 一个实例时，可以随时调用构造子创建新的实例
        // 要纠正这种情况较为困难，必须根据具体的情况做出决定，如果一个类在最初被设计成单例类，但是后来发现实际上此类应当有有限个多个实例，这时
        // 当考虑是否将单例类改为多例类
        // 设计师的java知识很好，而且也知道单例模式的正确使用方法，但是还是有意使用这种不完全的单例模式，因为他意在使用一改良的单例模式，这时候
        // 除去共有的构造子不符合单例模式的要求之外 ，这个类必须很好的单例模式
        // 默认的单例模式
        // 有些设计师将这种不完全的单例模式叫做里，一个类提供静态的方法，如同单例模式一样，同时又提供了一个公开的构造子，如同普通的类一样
        // 这样做的好处，这种模式允许客户端选择如何将类实例化，创建新的自己独有的实例，或者使用共享的实例
        // 这样一来，由于没有任何强制性的措施，客户端的选择不一定合理选择，其结果的设计往往不会花费时间如何提供最好的选择上，而是恰当将这种
        // 选择交给客户端程序员，这样必然导致不理想设计欠考虑的实现
        // 相关模式
        // 有一些模式可以使用单例模式，如抽象工厂模式可以使用单例模式，将具体的工厂类设计成单例模式，
        // 多例模式
        // 正如同本章所说的，单例模式的精神可以推广到多于一个实例的情况，这时候，类叫做多例类，这种模式叫做多例模式，单例类和多例类的类图所示
        // 关于多例模式，
        // 简单的工厂模式
        // 单例模式的使用的简单的工厂模式，又称为静态工厂模式，来提供自己的实例，在上面的ConfigManager的例子的代码中，静态工厂方法getInstance()
        // 就是静态的工厂方法，在java.awt.Toolkit类中，getDefaulToolkit() 方法就是静态工厂方法，简单的工厂模式简略类图如下图所示
        // 本章讨论单例模式的结构和实现方法
        // 单例械是一个看上去很简单的模式，很多的设计师最先学会往往是单例模式，然而，随着java系统日益变得得要和分散化，尽量不要使用有状态的
        // 单例模式可以提供很多得要的逻辑，而一个原始变量不能自己初始化，不可能，在可能，有继承关系，没有内部结构，因此，单例模式，有很多优越
        // 之处
        // 在java语言里没有内部结构，因此单例模式有很多优越之处
        // 在java言语并没有真正的全程变量，一个变量必须必须属于某一个类或者某一个实例，而复杂程序当中，一个静态变量的初始化发生，不可能有继
        // 继承关系，没有内部结构，因此单例模式有很多的优越之处
        // 在java语言里并没有真正的全程变量，一个变量必须属于某一个类或者某一个实例，而在复杂的程序当中，一个静态的变量的初始化，发生的哪一个
        // 里常常是一个不易确定的问题
        // 当然，使用全程，原始变量并没有错误，就好像选择，使用Fortran语言而非java语言编程并不是一种对错问题一样
        // 上面的这个记录的最左边的是国际网络上使用的电子邮件的域名，第三列的一个数字10，这JNDI全称是java命名和地址界面，是在1997年初由
        // Sun Microsystem引进的，其目的是为了java系统提供支持各种目录类型的一个
        // JNDI 架构由JNDI API 和JNDI SPI组成，JNDI API 使得一个java应用程序可以使用一系列的命名和目录服务，JNDI SPI 是为了服务提供商
        // JNDI API由下面的四个库组成
        // javax.names : 包括了使用命名服务的类和接口
        // javax.naming.directory : 扩展了核心库javax.namming 的功能，提供了目录访问功能
        // javax.naming.event : 包括了命名和目录服务中的需要的事件通知机制的类和接口
        // javax.naming.ldap: 包括了命名和目录服务中的支持LDAP(v3) 所需要的类和接口
        // 构成了JNDI SPI 的库为javax.naming.spi 括的类和接口允许的各种命名和目录服务，提供商能将自己的软件服务构件加入到JNDI架构中去
        // 在JNDI里，所有的命名和目录操作都是相对于某一个context 环境而言的，JNDI没有任何的绝对根目录，JNDI定义了一个初始环境对象，称为
        // InitalContext ，来提供命名和目录操作的起始点，一旦得到了初始环境，就可以使用初始环境查询其他的环境对象
        // 如何使用JNDI编程
        // 本节提供了一个非常简洁的介绍，讲解了如何在java中调用JNDI的功能
        // 建立开发环境
        // 首先，如果读者没有最新的版本的JNDI和DNS库的话，请到sum Microsystem网站上下载jndi.jar的包，然后将以下的三个jar文件放到
        // classpath上面
        // 创建环境对象，
        // 在创建初始环境之前，必须指明两个环境性质参数，如代码清单如下，第一个环境参数是服务提供商名，即 java.naming.factor.initial，这个
        // 性质的值应当是一下com.sun.jndi.dns.DnsContextFactory，也就是说DNS服务类的名字，有了这个类名，程序就可以动态的加载这个驱动类
        // 第二个性质参数就是DNS服务器的URL,即java.naming.provider.url,这个性质的值应当是一个所在网络中的一个合法DNS服务器的啥名字。
        // 对于，本书作者来说就是dns://dns01390.ny.jeffcorp.com
        // 系统设计
        // 现在可以进行系统设计了，首先，系统需要一个单例类负责查询 和保存列表，当然，由于SMTP服务器的信息包括优先权和服务器的啥名字，因此
        // 还需要一个MailServer类用于存储关于一个SMTP服务器的信息，这样就有了下面的但是介绍的两个类
        // 系统的静态结构
        // MX信息查询系统的设计图如下所示
        // 源代码
        // 下面就是MailServer类的源代码，如代码清单7所示，这个类用于存储SMTP服务器的信息，包括服务器的名字和优先权
        // 

















}
