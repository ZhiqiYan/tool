集合相关知识点:
一.集合体系：
    单列集合(Collection)
        List：元素可重复，存储有序
            ArrayList   数组结构：查询快，增删慢，线程不安全
            LinkedList  链表结构：查询慢，增删快，线程不安全
            Vector      数组结构：查询快，增删慢，线程安全

        Set：元素不可重复，引用数据类型需要重写equals方法，存储无序
            HashSet         重写hashCode和equals方法保证数据唯一性
            LinkedHashSet   保证怎么存怎么取
            TreeSet
                a.自然顺序(Comparable):集合元素实现Comparable接口并重写compareTo方法
                b.较器顺序(Comparator):创建集合时传入Comparator比较器
                TreeSet构造函数什么都不传, 默认按照类中Comparable的顺序(没有就报错ClassCastException)  TreeSet如果传入Comparator, 就优先按照Comparator
    双列集合(Map)
        HashMap
        LinkedHashMap
        TreeMap

二.集合遍历
    1.List
        a.普通for循环, 使用get()逐个获取
        b.调用iterator()方法得到Iterator, 使用hasNext()和next()方法
        c.增强for循环, 只要可以使用Iterator的类都可以用
        d.Vector集合可以使用Enumeration的hasMoreElements()和nextElement()方法
    2.Set
        a.调用iterator()方法得到Iterator, 使用hasNext()和next()方法
        b.增强for循环, 只要可以使用Iterator的类都可以用
        c.普通for循环,迭代器,增强for循环是否可以在遍历的过程中删除

三.HashTable和hashMap区别
        Hashtable是JDK1.0版本出现的,是线程安全的,效率低,
        HashMap是JDK1.2版本出现的,是线程不安全的,效率高
        Hashtable不可以存储null键和null值,
        HashMap可以存储null键和null值