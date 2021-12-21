package mighty.classproject.objects;

public class subcommandinfo {
        private String name;
        private String compileforname;
        private String description;


        public subcommandinfo(String name, String compileforname, String description) {
            this.name = name;
            this.compileforname = compileforname;
            this.description = description;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCompileforname() {
            return compileforname;
        }

        public void setCompileforname(String compileforname) {
            this.compileforname = compileforname;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }


}
