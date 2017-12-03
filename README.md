# android-Zxing-portrait
Zxing竖屏解决方案,详情参考博客[Google ZXing系列讲解(四)——ZXing 解决竖屏扫描问题](http://www.jianshu.com/p/b78a967e2ac7 "点击查看博客")</br>
对相机焦距有所调整，CameraConfigurationManager这个类修改setDesiredCameraParameters方法。
```Java
Camera theCamera = camera.getCamera();
    Camera.Parameters parameters = theCamera.getParameters();
    int zoomSize = parameters.getMaxZoom();
    parameters.setZoom(zoomSize - 1);
   
    将相机焦距设为差不多最大，这样方便在远距离实现扫描。
