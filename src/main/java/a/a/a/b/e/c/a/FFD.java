package a.a.a.b.e.c.a;

import java.util.HashMap;
import java.util.Map;

public class FFD extends RuntimeException {
   private static final long serialVersionUID = 1L;
   private static final Map<Long, String> HFX;
   private final long HFY;

   public FFD(long var1, String var3, Throwable var4) {
      super(var3, var4);
      this.HFY = var1;
   }

   public FFD(long var1, String var3) {
      super(var3);
      this.HFY = var1;
   }

   public FFD(long var1, Throwable var3) {
      super(var3);
      this.HFY = var1;
   }

   public long getErrorCode() {
      return this.HFY;
   }

   public String getErrorName() {
      return (String)HFX.get(this.HFY);
   }

   static {
      int[] var0 = new int[]{0, 1, 2, 3, 5, 6, 7, 8, 9, 10, 16, 17, 18, 19, 32, 33, 48, 49, 50, 64, 65, 80, 81, 84, 96, 98, 99, 100, 101, 102, 103, 104, 105, 106, 112, 113, 130, 144, 145, 160, 161, 162, 163, 164, 176, 177, 179, 180, 181, 182, 183, 184, 192, 193, 208, 209, 224, 225, 226, 240, 241, 242, 256, 257, 258, 259, 260, 261, 272, 274, 275, 276, 277, 288, 289, 304, 336, 352, 368, 384, 400, 401, 416, 417, 512, -2147483648};
      String[] var1 = new String[]{"CKR_OK", "CKR_CANCEL", "CKR_HOST_MEMORY", "CKR_SLOT_ID_INVALID", "CKR_GENERAL_ERROR", "CKR_FUNCTION_FAILED", "CKR_ARGUMENTS_BAD", "CKR_NO_EVENT", "CKR_NEED_TO_CREATE_THREADS", "CKR_CANT_LOCK", "CKR_ATTRIBUTE_READ_ONLY", "CKR_ATTRIBUTE_SENSITIVE", "CKR_ATTRIBUTE_TYPE_INVALID", "CKR_ATTRIBUTE_VALUE_INVALID", "CKR_DATA_INVALID", "CKR_DATA_LEN_RANGE", "CKR_DEVICE_ERROR", "CKR_DEVICE_MEMORY", "CKR_DEVICE_REMOVED", "CKR_ENCRYPTED_DATA_INVALID", "CKR_ENCRYPTED_DATA_LEN_RANGE", "CKR_FUNCTION_CANCELED", "CKR_FUNCTION_NOT_PARALLEL", "CKR_FUNCTION_NOT_SUPPORTED", "CKR_KEY_HANDLE_INVALID", "CKR_KEY_SIZE_RANGE", "CKR_KEY_TYPE_INCONSISTENT", "CKR_KEY_NOT_NEEDED", "CKR_KEY_CHANGED", "CKR_KEY_NEEDED", "CKR_KEY_INDIGESTIBLE", "CKR_KEY_FUNCTION_NOT_PERMITTED", "CKR_KEY_NOT_WRAPPABLE", "CKR_KEY_UNEXTRACTABLE", "CKR_MECHANISM_INVALID", "CKR_MECHANISM_PARAM_INVALID", "CKR_OBJECT_HANDLE_INVALID", "CKR_OPERATION_ACTIVE", "CKR_OPERATION_NOT_INITIALIZED", "CKR_PIN_INCORRECT", "CKR_PIN_INVALID", "CKR_PIN_LEN_RANGE", "CKR_PIN_EXPIRED", "CKR_PIN_LOCKED", "CKR_SESSION_CLOSED", "CKR_SESSION_COUNT", "CKR_SESSION_HANDLE_INVALID", "CKR_SESSION_PARALLEL_NOT_SUPPORTED", "CKR_SESSION_READ_ONLY", "CKR_SESSION_EXISTS", "CKR_SESSION_READ_ONLY_EXISTS", "CKR_SESSION_READ_WRITE_SO_EXISTS", "CKR_SIGNATURE_INVALID", "CKR_SIGNATURE_LEN_RANGE", "CKR_TEMPLATE_INCOMPLETE", "CKR_TEMPLATE_INCONSISTENT", "CKR_TOKEN_NOT_PRESENT", "CKR_TOKEN_NOT_RECOGNIZED", "CKR_TOKEN_WRITE_PROTECTED", "CKR_UNWRAPPING_KEY_HANDLE_INVALID", "CKR_UNWRAPPING_KEY_SIZE_RANGE", "CKR_UNWRAPPING_KEY_TYPE_INCONSISTENT", "CKR_USER_ALREADY_LOGGED_IN", "CKR_USER_NOT_LOGGED_IN", "CKR_USER_PIN_NOT_INITIALIZED", "CKR_USER_TYPE_INVALID", "CKR_USER_ANOTHER_ALREADY_LOGGED_IN", "CKR_USER_TOO_MANY_TYPES", "CKR_WRAPPED_KEY_INVALID", "CKR_WRAPPED_KEY_LEN_RANGE", "CKR_WRAPPING_KEY_HANDLE_INVALID", "CKR_WRAPPING_KEY_SIZE_RANGE", "CKR_WRAPPING_KEY_TYPE_INCONSISTENT", "CKR_RANDOM_SEED_NOT_SUPPORTED", "CKR_RANDOM_NO_RNG", "CKR_DOMAIN_PARAMS_INVALID", "CKR_BUFFER_TOO_SMALL", "CKR_SAVED_STATE_INVALID", "CKR_INFORMATION_SENSITIVE", "CKR_STATE_UNSAVEABLE", "CKR_CRYPTOKI_NOT_INITIALIZED", "CKR_CRYPTOKI_ALREADY_INITIALIZED", "CKR_MUTEX_BAD", "CKR_MUTEX_NOT_LOCKED", "CKR_FUNCTION_REJECTED", "CKR_VENDOR_DEFINED"};
      HFX = new HashMap();

      for(int var2 = 0; var2 < var0.length; ++var2) {
         HFX.put((long)var0[var2], var1[var2]);
      }

   }
}
