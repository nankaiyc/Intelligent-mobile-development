# Flutter Introduction

## preface
With the maturity of mobile development technology, some manufacturers began to consider cross platform technology solutions, from <strong>Cordova</strong> and <strong>Xamarin</strong> in the early stage to <strong>React Native</strong>, <strong>weex</strong> and so on, can be said to be a hundred, each framework has its own advantages and disadvantages, but the goal is the same, that is to improve the efficiency of application development, reduce the cost of research and development, a set of code to run multiple platforms. Except for <strong>Xamarin</strong>, these frameworks all use web technology to develop mobile applications, but provide better user experience than web.

## Flutter comes out
1.Flutter is a mobile UI framework launched by Google in 2015, which can quickly build high-quality native user interface on IOS and Android.

2.Flutter first appeared at dart developer summit in May 2015. Its initial name was "sky", and later it was renamed as flutter. Flutter was developed in dart language, which was a new computer programming language launched by Google in 2011.

## Flutter features
<strong>1.Rapid development</strong>
- Because dart is chosen as the development language of flutter, dart can be either AOT (ahead of time) compilation or JIT (just in time) compilation. The JIT compilation features enable flutter to achieve sub second level stateful hot overload in the development phase, which greatly improves the development efficiency.

<strong>2.Excellent performance</strong>
- Using the built-in high-performance rendering engine (skia) for self painting, the rendering speed and user experience are comparable to native.

<strong>3.Expressive UI</strong>
- Flutter is built with many beautiful material design and Cupertino (IOS style) widgets, so developers can quickly build a beautiful user interface to provide a better user experience.

## Flutter framework
<strong>Flutter framework is divided into three layers: Framework layer, Engine layer and Embedder layer.</strong>
- <strong>Framework layer:</strong>Implemented by dart, it contains many Android material style and IOS Cupertino style widgets, as well as rendering, animation, drawing and gesture. Framework contains a large number of APIs for daily development. It is OK for common application developers to be familiar with the use of these APIs, but many controls in special scenarios need to be customized according to the actual situation.
Source code address of Framework layer:
[https://github.com/flutter/flutter/tree/master/packages/flutter/lib](https://github.com/flutter/flutter/tree/master/packages/flutter/lib)
- <strong>Engine layer:</strong>Implemented by C / C + +, it is the core engine of flutter, mainly including skia graphics engine, dart runtime environment dart VM, text rendering engine, etc.; if you want to deeply understand the principle of flutter, it is recommended to read the source code of this layer.
Source code address:
[https://github.com/flutter/engine](https://github.com/flutter/engine)
- <strong>Embedder layer:</strong>It mainly deals with some platform related operations, such as rendering surface settings, local plug-ins, packaging, thread settings, etc.

## Flutter principle
Both IOS and Android provide a platform of view to the flutter layer, and the page content rendering is completed by the flutter layer itself, so its performance is better than that of react native and other frameworks. <strong>The flow of graphics rendering in flutter is as follows</strong>:
- 1.The Vsync signal of GPU is synchronized to UI thread
- 2.The UI thread uses dart to build an abstract view structure
- 3.Layer composition of view structure in GPU thread
- 4.The synthesized view data is provided to the ska graphics engine to process into GPU data
- 5.The data is then provided to GPU for rendering through OpenGL or Vulkan

## Write at the end
If you find any mistakes or have something willing to share with me,welcome to contact with me.
My QQ number is 1245776006 and my Wechat is qinyinchang.
 



