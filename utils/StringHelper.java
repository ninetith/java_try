package utils;

// 克隆函数：与 ProductService.isValidProduct 非常相似
public class StringHelper {
    public static boolean isNullOrEmpty(String str) {
        if (str == null || str.trim().isEmpty()) {
            return true;
        }
        return false;
    }
}
