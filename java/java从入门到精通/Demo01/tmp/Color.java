package org.lxh.enumdemo.demo06;

public enum Color implements Info{
	RED{
		public String getColor(){
			return "红色";
		}
	},
	GREEN{
		public String getColor(){
			return "绿色";
		}
	},
	BLUE{
		public String getColor(){
			return "蓝色";
		}
	};
	
}
