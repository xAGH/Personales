namespace AuxiliosFamiliares
{
    class Employee
    {
        private string name = "";
        private int sons = 0;
        private decimal baseSalary = 0;
        private string pronoun = "";
        private decimal subsidy = 0; 

        public string Name { get { return name; } set { name = value.ToUpper(); } }
        public int Sons { get { return sons; } set { sons = value; } }
        public decimal BaseSalary { get { return baseSalary; } set { baseSalary = value; } }
        public string Pronoun { get { return pronoun; } set { pronoun = value; } }
        public decimal Subsidy { get { return subsidy; } set { subsidy = value; } }
    }
}
