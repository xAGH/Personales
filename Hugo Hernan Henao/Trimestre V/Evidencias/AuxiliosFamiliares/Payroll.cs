namespace AuxiliosFamiliares
{
    class Payroll
    {
        private decimal valuePerSonLT = 30000;
        private decimal valuePerSonGT = 15000;
        public decimal Liquidation(int sons, decimal baseSalary) => sons > 0 ? (baseSalary <= 1500000 ? valuePerSonLT * sons : valuePerSonGT * sons) : 0;
    }
}
