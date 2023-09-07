# Binary Search Tree Örneği

Bu örnek, verilen bir dizi ile Binary Search Tree (BST) oluşturma aşamalarını göstermektedir.

## Verilen Dizi

Verilen dizi: `[7, 5, 1, 8, 3, 6, 0, 9, 4, 2]`

## BST Oluşturma Aşamaları

1. **Kök Node:** Root, 7'dir.
2. **Kökün Sağından Node Ekleme:** 8, 7'nin sağına eklenir.
3. **Kökün Solundan Node Ekleme:** 5, 7'nin soluna eklenir.
4. **Sol Alt Ağaçtaki Node'lar:** 1, 3, 0, 2 ve 4 sırasıyla 5'e eklenir.
5. **Sağ Alt Ağaçtaki Node'lar:** 8'nin sağına 9 eklenir.
6. **Sol Alt Ağaçtaki Node'lar:** 6, 4, 2 ve 3 sırasıyla 5'e eklenir.

Sonuçta oluşan BST:
7
/ \
5   8
/ \   \
1   6   9
\     /
3   4
\
2
