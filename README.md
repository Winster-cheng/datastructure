# datastructure

###chapter01

###chapter02
#####2.1.1 选择排序：每一次从待排序的数据元素中选出最小（或最大）的一个元素，存放在序列的起始位置，然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。以此类推，直到全部待排序的数据元素排完。
- 注意代码中min的作用有2个

#####2.1.2 插入排序 将一个数据插入到已经排好序的有序数据中，从而得到一个新的、个数加一的有序数据，算法适用于少量数据的排序，时间复杂度为O(n^2)。特点是:

- 第一层从i=1开始循环
- 第二层j=i从最右边的开始对比，一直向左移动直到左边的数值比该数值小

#####2.1.3 希尔排序（缩小增量排序），直接插入排序算法的一种更高效的改进版本(https://blog.csdn.net/weixin_37818081/article/details/79202115)

######（1）希尔排序（shell sort）这个排序方法又称为缩小增量排序，是1959年D·L·Shell提出来的。该方法的基本思想是：设待排序元素序列有n个元素，首先取一个整数increment（小于n）作为间隔将全部元素分为increment个子序列，所有距离为increment的元素放在同一个子序列中，在每一个子序列中分别实行直接插入排序。然后缩小间隔increment，重复上述子序列划分和排序工作。直到最后取increment=1，将所有元素放在同一个子序列中排序为止。 
######（2）由于开始时，increment的取值较大，每个子序列中的元素较少，排序速度较快，到排序后期increment取值逐渐变小，子序列中元素个数逐渐增多，但由于前面工作的基础，大多数元素已经基本有序，所以排序速度仍然很快。 
######（3）希尔排序举例： 
- 1>下面给出一个数据列： 

![avatar](https://ws4.sinaimg.cn/large/006tNc79ly1g33a52zkq3j30hm035dfu.jpg)
- 2>第一趟取increment的方法是：n/3向下取整+1=3（关于increment的取法之后会有介绍）。将整个数据列划分为间隔为3的3个子序列，然后对每一个子序列执行直接插入排序，相当于对整个序列执行了部分排序调整。图解如下：

![avatar](https://ws4.sinaimg.cn/large/006tNc79ly1g33a9f5cufj30hm0efdfw.jpg) 
- 3>第二趟将间隔increment= increment/3向下取整+1=2，将整个元素序列划分为2个间隔为2的子序列，分别进行排序。图解如下：

 ![avatar](https://ws3.sinaimg.cn/large/006tNc79ly1g33a9epob6j30hm0coaa3.jpg)
- 4>第3趟把间隔缩小为increment= increment/3向下取整+1=1，当增量为1的时候，实际上就是把整个数列作为一个子序列进行插入排序，图解如下：

![avatar](https://ws3.sinaimg.cn/large/006tNc79ly1g33a9el7dhj30hm09o0sp.jpg) 
- 5>直到increment=1时，就是对整个数列做最后一次调整，因为前面的序列调整已经使得整个序列部分有序，所以最后一次调整也变得十分轻松，这也是希尔排序性能优越的体现。
######（4）关于希尔排序increment（增量）的取法。 
增量increment的取法有各种方案。最初shell提出取increment=n/2向下取整，increment=increment/2向下取整，直到increment=1。但由于直到最后一步，在奇数位置的元素才会与偶数位置的元素进行比较，这样使用这个序列的效率会很低。后来Knuth提出取increment=n/3向下取整+1.还有人提出都取奇数为好，也有人提出increment互质为好。应用不同的序列会使希尔排序算法的性能有很大的差异。 
######（5）希尔排序应该注意的问题 
从上面图解希尔排序的过程可以看到，相等的排序码25在排序前后的顺序发生了颠倒，所以希尔排序是一种不稳定的排序算法。
