package Pages.API;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class JsonLogin {
    public class Data {
        @SerializedName("id")
        @Expose
        private Integer id;
        public Integer getId() {
            return id;
        }
        public void setId(Integer id) {
            this.id = id;
        }
    }

    public class Login {
        @SerializedName("code")
        @Expose
        private Integer code;
        @SerializedName("data")
        @Expose
        private Data data;
        public Integer getCode() {
            return code;
        }
        public void setCode(Integer code) {
            this.code = code;
        }
        public Data getData() {
            return data;
        }
        public void setData(Data data) {
            this.data = data;
        }
    }
}
