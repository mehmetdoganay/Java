# Sorting Algoritma Örnekleri

Bu readme, farklı sıralama algoritmalarının nasıl çalıştığını ve nasıl uygulandığını gösteren basit örnekleri içermektedir.

## Insertion Sort Örneği

### Verilen Dizi: [22, 27, 16, 2, 18, 6]

Aşamalar:

1. Adım: [22] (27, 16, 2, 18, 6)
2. Adım: [22, 27] (16, 2, 18, 6)
3. Adım: [16, 22, 27] (2, 18, 6)
4. Adım: [2, 16, 22, 27] (18, 6)
5. Adım: [2, 16, 18, 22, 27] (6)
6. Adım: [2, 6, 16, 18, 22, 27]

**Insertion Sort'un Big-O Gösterimi:** En kötü durum zaman karmaşıklığı O(n^2), en iyi ve ortalama durum karmaşıklığı ise O(n)’dir.

**18 sayısı için:** Dizi sıralandıktan sonra, 18 sayısı Average case'e girer. Çünkü ortalama pozisyonda bulunur.

## Selection Sort Örneği

### Verilen Dizi: [7, 3, 5, 8, 2, 9, 4, 15, 6]

Aşamalar:

1. Adım: [2, 3, 5, 8, 7, 9, 4, 15, 6]
2. Adım: [2, 3, 5, 8, 7, 9, 4, 15, 6]
3. Adım: [2, 3, 4, 8, 7, 9, 5, 15, 6]
4. Adım: [2, 3, 4, 5, 7, 9, 8, 15, 6]

Bu repo, farklı sıralama algoritmalarının çalışma mantığını anlamak isteyenler için iyi bir kaynak olabilir. Her algoritmanın detaylı açıklamaları ve örnek adımları bulunmaktadır.

---
