namespace AuxiliosFamiliares
{
    static class Payroll
    {
        private static decimal valuePerSonLT = 30000;
        private static decimal valuePerSonGT = 15000;

        public static decimal Liquidation(int sons, decimal baseSalary) => sons > 0 ? (baseSalary < 1500000 ? valuePerSonLT * sons : valuePerSonGT * sons) : 0;
    }
}
