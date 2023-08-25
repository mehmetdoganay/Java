# <span style="color:lightblue">Java Sınıflar Arası İlişkiler: Bağımlılık (Dependency)</span>

Bu döküman, Java programlama dilinde **"bağımlılık" ilişkisini** ("uses a" ilişkisi) açıklamaktadır. Bağımlılık, bir sınıfın başka bir sınıfın özelliklerini veya davranışlarını kullanarak işlevini gerçekleştirdiği bir ilişki türüdür.

## <span style="color:green">Bağımlılık (Dependency) Nedir?</span>

Bağımlılık, bir sınıfın başka bir sınıfın nesnesini kullanarak işlevlerini gerçekleştirdiği bir ilişki türüdür. Bir sınıf, başka bir sınıfın özelliklerini veya metotlarını kullanarak, o sınıfın işlevlerini genişletir veya tamamlar. Bu ilişkide, bir sınıf diğer sınıfın nesnesine "bağımlıdır".

**Bağımlılık ilişkisini "uses a" ilişkisi** olarak da düşünebiliriz. Yani, bir sınıf başka bir sınıfın işlevlerini kullanarak kendi işlevselliğini sağlar.

## <span style="color:purple">Örnek: Müzik Çalıcı</span>

Aşağıdaki örnek, bir `Müzik Çalıcı` sınıfının (`MusicPlayer`) **Bağımlılık ilişkisi** ile bir `Ses Sistemi` sınıfını (`SoundSystem`) nasıl kullandığını göstermektedir.

```java
class SoundSystem {
    void playSound() {
        // Ses sistemini kullanarak ses çalma işlemi
    }
}

class MusicPlayer {
    private SoundSystem soundSystem;
    // SoundSystem sınıfına ait soundSystem adında bir niteliği Music player Sınıfında kullandık, bağladık.
    public MusicPlayer() {
        soundSystem = new SoundSystem();
    }

    void playMusic() {
        // Müzik çalma işlemi için Ses Sistemi'ni kullan
        soundSystem.playSound();
    }
}
```
---
Bu örnekte MusicPlayer sınıfı, müzik çalma işlevini gerçekleştirmek için SoundSystem sınıfının özelliklerini kullanır. MusicPlayer, ses çalmak için SoundSystem'e bağımlıdır.
---
***
***
# <span style="color:lightblue">Java Sınıflar Arası İlişkiler: Birleştirme (Composition) / "has a" İlişkisi</span>

Bu döküman, Java programlama dilinde **<span style="color:lightblue">"Birleştirme" ilişkisini</span>** ("has a" ilişkisi) açıklamaktadır. Birleştirme, bir sınıfın başka bir sınıfın nesnesini içerdiği bir ilişki türüdür.

## <span style="color:green">Birleştirme (Composition) Nedir?</span>

Birleştirme, bir sınıfın başka bir sınıfın nesnesini içerecek şekilde tasarlandığı bir ilişki türüdür. Bu ilişkide, iç sınıf, dış sınıfın bir parçasıdır. Birleştirme ile iç sınıf, dış sınıf olmadan var olamaz. Dış sınıf, iç sınıfı kontrol eder ve yaşam döngüsünden sorumludur.

**<span style="color:green">Birleştirme ilişkisi "has a" ilişkisi</span>** olarak da düşünülebilir. Yani, bir sınıf başka bir sınıfın nesnesini içerir ve onun özelliklerini veya işlevselliğini kullanır.

## <span style="color:purple">Örnek: Araba ve Motor</span>

Aşağıdaki örnek, `Araba` sınıfının (`Car`) **<span style="color:purple">Birleştirme ilişkisi</span>** ile bir `Motor` sınıfını (`Engine`) nasıl içerdiğini göstermektedir.

```java
class Engine {
    // Motor sınıfının özellikleri ve metotları
}

class Car {
    private Engine engine;

    public Car() {
        engine = new Engine(); // Araba'nın motoruna bir motor bağlıyoruz
    }

    void start() {
        engine.start(); // Arabayı çalıştırırken motoru kullanıyoruz
    }
}
```
---
Bu örnekte Car sınıfı, bir Engine (motor) nesnesini içerir. Araba, motor olmadan var olamaz ve motorun işlevselliğini kullanarak kendi işlevselliğini gerçekleştirir.
---