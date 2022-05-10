namespace AuxiliosFamiliares
{
    class Employee
    {
        private string name = "";
        private int sons = 0;
        private decimal baseSalary = 0;

        public string Name { get { return name.ToUpper(); } set { name = value.ToLower(); } }
        public int Sons { get { return sons; } set { sons = value; } }
        public decimal BaseSalary { get { return baseSalary; } set { baseSalary = value; } }
    }
}
