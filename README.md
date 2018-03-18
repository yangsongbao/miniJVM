### 这是一个用java编写的迷你版jvm，用于学习
### 实现的功能
1. 类文件的加载
    1. 类文件的解析
        - 魔数（完成）
        - class文件的版本（完成）
        - 常量池
            - CONSTANT_Utf8_info（完成）
            - CONSTANT_Integer_info（完成）
            - CONSTANT_Float_info（完成）
            - CONSTANT_Long_info（完成）
            - CONSTANT_Double_info（完成）
            - CONSTANT_Class_info（完成）
            - CONSTANT_String_info（完成）
            - CONSTANT_Fieldref_info（完成）
            - CONSTANT_Methodref_info（完成）
            - CONSTANT_InterfaceMethodref_info（完成）
            - CONSTANT_NameAndType_info（完成）
            - CONSTANT_MethodHandle_info（完成）
            - CONSTANT_MethodType_info（完成）
            - CONSTANT_InvokeDynamic_info（完成）
        - 访问标志（完成）
        - 类索引（完成）
        - 父类索引（完成）
        - 接口计数器和接口表（完成）
        - 字段计数器和字段表（完成）
        - 方法计数器和方发表（完成）
        - 属性计数器和属性表
            - ConstantValue（完成）
            - Code（完成）
            - StackMapTable（太复杂，部分完成）
            - Exceptions（完成）
            - InnerClasses（完成）
            - EnclosingMethod（完成）
            - Synthetic（完成）
            - Signature（完成）
            - SourceFile（完成）
            - SourceDebugExtension（完成）
            - LineNumberTable（完成）
            - LocalVariableTable（完成）
            - LocalVariableTypeTable（完成）
            - Deprecated（完成）
            - RuntimeVisibleAnnotations（未完成）
            - RuntimeInvisibleAnnotations（未完成）
            - RuntimeVisibleParameterAnnotations（未完成）
            - RuntimeInvisibleParameterAnnotations（未完成）
            - AnnotationDefault（未完成）
            - BootstrapMethods（完成）
        
    2. classPath的管理
2. 虚拟机字节码执行引擎
### 参考资料
1. [Java虚拟机规范（JavaSE7）](https://files.cnblogs.com/files/zhuYears/Java%E8%99%9A%E6%8B%9F%E6%9C%BA%E8%A7%84%E8%8C%83%EF%BC%88JavaSE7%EF%BC%89.pdf)
2. [《深入理解JAVA虚拟机》](https://book.douban.com/subject/24722612/)