package com.weimr.designpatterns.iterator.demo.optimize;

/**
 * @author weimr
 * @date 2024/01/04
 */
public class Boss {
    public static void main(String[] args) {
        //定义一个List，存放所有的项目对象
        IProject project = new Project();
        //增加星球大战项目
        project.add("星球大战项目 ddddd", 10, 1000000);
        //增加扭转时空项目
        project.add("扭转时空项目", 100, 10000000);
        //增加超人改造项目
        project.add("超人改造项目", 10000, 100000000);
        //其它100个项目
        for (int i = 0; i < 104; i++) {
            project.add("第" + i + "个项目", i * 5, i * 1000000);
        }
        //遍历一下ArrayList，把所有的数据都取出
        IProjectIterator projectIterator = project.iterator();
        while (projectIterator.hasNext()) {
            IProject p = (IProject) projectIterator.next();
            System.out.println(p.getProjectInfo());
        }
    }
}
