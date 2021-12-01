module.exports = {
  purge: {
    content: [
      './src/**/*.{html,ts}',
    ]
  },
  mode:'jit',
  darkMode: false, // or 'media' or 'class'
  theme: {
    extend: {
      backgroundImage: {
        'banner': "url('https://raw.githubusercontent.com/xAGH/SolutionIPS/main/frontend/src/assets/banner.jpg')",
      },
      gridTemplateRows: {
        '40/60': '35vh auto'
      }
    }
  },
  variants: {
    extend: {},
  },
  plugins: [],
}
