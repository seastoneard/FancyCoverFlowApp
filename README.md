# FancyCoverFlowApp


<!-- Baidu Button BEGIN -->

<div id="article_content" class="article_content">
                        
<p style="text-align:center;"><span style="font-family:Verdana, Arial, Helvetica, sans-serif;background-color:rgb(254,254,242);"><span style="font-size:24px;">Android画廊效果</span><br /></span></p>
<p style="text-align:center;"><span style="font-family:Verdana, Arial, Helvetica, sans-serif;background-color:rgb(254,254,242);"><span style="font-size:24px;"><br /></span></span></p>
<p><span style="font-family:Verdana, Arial, Helvetica, sans-serif;font-size:16px;background-color:rgb(254,254,242);"><br /></span></p>
<p><span style="font-family:Verdana, Arial, Helvetica, sans-serif;font-size:16px;background-color:rgb(254,254,242);"><strong>前言：</strong>G<span style="color:rgb(51,51,51);font-family:Arial, 'Microsoft Yahei', 'Hiragino Sans GB';font-size:14px;">allery是一个内部元素控件，可以水平滚动，并且可以把当前选择的子元素定位在它中心的布局组件；<span style="font-family:Verdana, Arial, Helvetica, sans-serif;font-size:16px;background-color:rgb(254,254,242);">画廊Gallery一般用来显示</span><span style="font-family:Verdana, Arial, Helvetica, sans-serif;font-size:16px;background-color:rgb(254,254,242);">可左右移动</span><span style="font-family:Verdana, Arial, Helvetica, sans-serif;font-size:16px;background-color:rgb(254,254,242);">图片的列表（具体请看实例）。</span></span></span></p>
<p><span style="font-family:Verdana, Arial, Helvetica, sans-serif;font-size:16px;background-color:rgb(254,254,242);"><span style="color:rgb(51,51,51);font-family:Arial, 'Microsoft Yahei', 'Hiragino Sans GB';font-size:14px;"><span style="font-family:Verdana, Arial, Helvetica, sans-serif;font-size:16px;background-color:rgb(254,254,242);"><br /></span></span></span></p>
<p><span style="font-family:Verdana, Arial, Helvetica, sans-serif;font-size:16px;background-color:rgb(254,254,242);"><span style="color:rgb(51,51,51);font-family:Arial, 'Microsoft Yahei', 'Hiragino Sans GB';font-size:14px;"><span style="font-family:Verdana, Arial, Helvetica, sans-serif;font-size:16px;background-color:rgb(254,254,242);"><br /></span></span></span></p>
<p><span style="font-family:Verdana, Arial, Helvetica, sans-serif;font-size:16px;background-color:rgb(254,254,242);"><span style="color:rgb(51,51,51);font-family:Arial, 'Microsoft Yahei', 'Hiragino Sans GB';font-size:14px;"><span style="font-family:Verdana, Arial, Helvetica, sans-serif;font-size:16px;background-color:rgb(254,254,242);"><span style="color:rgb(51,51,51);font-family:Verdana, Arial, Helvetica, sans-serif;font-size:16px;"><strong>效果：</strong></span><br /></span></span></span></p>
<p><span style="font-family:Verdana, Arial, Helvetica, sans-serif;font-size:16px;background-color:rgb(254,254,242);"><span style="color:rgb(51,51,51);font-family:Arial, 'Microsoft Yahei', 'Hiragino Sans GB';font-size:14px;"><span style="font-family:Verdana, Arial, Helvetica, sans-serif;font-size:16px;background-color:rgb(254,254,242);"><br /></span></span></span></p>
<p style="text-align:center;"><span style="font-family:Verdana, Arial, Helvetica, sans-serif;color:#333333;"><span style="font-size:16px;background-color:rgb(254,254,242);"><strong><img src="http://img.blog.csdn.net/20171213104950576" width="360" height="480" alt="" /></strong></span></span></p>
<p style="text-align:center;"><span style="font-family:Verdana, Arial, Helvetica, sans-serif;color:#333333;"><span style="font-size:16px;background-color:rgb(254,254,242);"><strong><br /></strong></span></span></p>
<p style="text-align:left;"><span style="font-family:Verdana, Arial, Helvetica, sans-serif;color:#333333;"><span style="font-size:16px;background-color:rgb(254,254,242);"><strong><br /></strong></span></span></p>
<p><span style="font-family:Verdana, Arial, Helvetica, sans-serif;color:#333333;"><span style="font-size:16px;background-color:rgb(254,254,242);"><strong><span style="color:rgb(51,51,51);font-family:'Microsoft YaHei', Arial;font-size:14px;"><span style="margin:0px;padding:0px;">开发环境：AndroidStudio2.2.1+gradle-2.14.1</span></span><br /></strong></span></span></p>
<p><span style="font-family:Verdana, Arial, Helvetica, sans-serif;color:#333333;"><span style="font-size:16px;background-color:rgb(254,254,242);"><strong><span style="color:rgb(51,51,51);font-family:'Microsoft YaHei', Arial;font-size:14px;"><span style="margin:0px;padding:0px;"><br /></span></span></strong></span></span></p>
<p><span style="font-family:Verdana, Arial, Helvetica, sans-serif;color:#333333;"><span style="font-size:16px;background-color:rgb(254,254,242);"><strong><span style="color:rgb(51,51,51);font-family:'Microsoft YaHei', Arial;font-size:14px;"><span style="margin:0px;padding:0px;"><br /></span></span></strong></span></span></p>
<p><span style="font-family:Verdana, Arial, Helvetica, sans-serif;color:#333333;"><span style="background-color:rgb(254,254,242);"><span style="color:rgb(51,51,51);font-family:'Microsoft YaHei', Arial;"><span style="margin:0px;padding:0px;"></span></span></span></span></p>
<div style="margin:0px;padding:0px;color:rgb(69,69,69);font-family:'PingFang SC', 'Microsoft YaHei', SimHei, Arial, SimSun;">
<span style="margin:0px;padding:0px;"><span style="margin:0px;padding:0px;color:rgb(51,51,51);font-family:'Microsoft YaHei', Arial;"><span style="margin:0px;padding:0px;"><span style="margin:0px;padding:0px;font-family:Arial;"><span><span style="font-size:14px;">涉及知识：</span></span></span></span><br /></span></span></div>
<div style="font-size:16px;margin:0px;padding:0px;color:rgb(69,69,69);font-family:'PingFang SC', 'Microsoft YaHei', SimHei, Arial, SimSun;">
<br /></div>
<div style="font-size:16px;font-weight:bold;margin:0px;padding:0px;color:rgb(69,69,69);font-family:'PingFang SC', 'Microsoft YaHei', SimHei, Arial, SimSun;">
<span style="margin:0px;padding:0px;font-size:18px;"><span style="margin:0px;padding:0px;color:rgb(51,51,51);font-family:'Microsoft YaHei', Arial;"><span style="margin:0px;padding:0px;"><span style="margin:0px;padding:0px;font-family:Arial;">1.自定义控件</span></span></span></span></div>
<div style="font-size:16px;font-weight:bold;margin:0px;padding:0px;color:rgb(69,69,69);font-family:'PingFang SC', 'Microsoft YaHei', SimHei, Arial, SimSun;">
<span style="margin:0px;padding:0px;color:rgb(51,51,51);font-family:'Microsoft YaHei', Arial;"><span style="margin:0px;padding:0px;"><span style="margin:0px;padding:0px;font-family:Arial;"><span style="margin:0px;padding:0px;font-size:18px;">2.<span style="font-family:Verdana, Arial, Helvetica, sans-serif;font-size:16px;background-color:rgb(254,254,242);">G</span><span style="color:rgb(51,51,51);font-family:Arial, 'Microsoft Yahei', 'Hiragino Sans GB';font-size:14px;">allery使用等</span></span></span></span></span></div>
<span style="font-size:14px;"><br /></span>
<p></p>
<p><span style="color:rgb(51,51,51);font-family:'Microsoft YaHei', Arial;"><span style="font-size:14px;">部分代码：</span></span><br /></p>
<p><span style="color:rgb(51,51,51);font-family:'Microsoft YaHei', Arial;"><span style="font-size:14px;"></span></span></p>
<pre class="java">public class MainActivity extends AppCompatActivity {

    //适配器
    private FancyCoverFlowSampleAdapter adapter = null;

    private FancyCoverFlow fancyCoverFlow;

    private List&lt;String&gt; list = new ArrayList&lt;&gt;();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initLayout();
        initData();
    }

    private void initLayout() {
        fancyCoverFlow = (FancyCoverFlow) findViewById(R.id.main_gallery);
        fancyCoverFlow.dp2px();// child间距
        adapter = new FancyCoverFlowSampleAdapter(this, list);
        fancyCoverFlow.setAdapter(adapter);
        //点击事件监听
        fancyCoverFlow.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView&lt;?&gt; parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "ItemClick--------&gt;" + position, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initData() {
        for (int i = 0; i &lt; 9; i++) {
            list.add("" + i);
        }
        adapter.notifyDataSetChanged();
        fancyCoverFlow.setSelection(1);//显示第几个
    }

    /**
     * FancyCoverFlow属性使用
     *
     * // 未选中的透明度
     * this.fancyCoverFlow.setUnselectedAlpha(0.0f);
     * // 未选中的饱和度
     * this.fancyCoverFlow.setUnselectedSaturation(0.0f);
     * // 未选中的比例
     * this.fancyCoverFlow.setUnselectedScale(0.8f);
     * // child间距
     * this.fancyCoverFlow.setSpacing(-60);
     * // 旋转度数
     * this.fancyCoverFlow.setMaxRotation(0);
     * // 非选中的重心偏移,负的向上
     * this.fancyCoverFlow.setScaleDownGravity(-1f);
     * // 作用距离
     * this.fancyCoverFlow.setActionDistance(FancyCoverFlow.ACTION_DISTANCE_AUTO);
     */
    
}</pre><br /><br /><p></p>


   </div>
   <!-- Baidu Button END -->
   
   
