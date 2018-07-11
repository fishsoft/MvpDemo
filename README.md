### 引用方式

* gradle
```
allprojects {
	repositories {
		maven { url 'https://jitpack.io' }
	}
}
  
dependencies {
       implementation 'com.github.fishsoft:MvpDemo:v1.0'
}
```

*maven
```
<repositories>
	<repository>
	    <id>jitpack.io</id>
	    <url>https://jitpack.io</url>
	</repository>
</repositories>

<dependency>
	  <groupId>com.github.fishsoft</groupId>
	  <artifactId>MvpDemo</artifactId>
	  <version>v1.0</version>
</dependency>
```
